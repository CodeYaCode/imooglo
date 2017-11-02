# autoGen.py
#!/user/bin/env python3
# -*- conding: utf-8 -*-

'autoGen.py'
'@author LiuChen'

import os
import time

import connection
import conf

def genPropName(str) :
	ss = str.split('_')
	if len(ss) == 1:
		# no '_'
		return ss[0]
	else :
		result = ss[0]
		for s in ss[1:] :
			result = result + s[0].upper() + s[1:]
		return result

def genObjsAndMethods() :
	# query the structure of the table.
	props = connection.connection()
	objs = ''
	methods = ''
	for prop in props :
		propName = genPropName(prop['COLUMN_NAME'].lower())
		dataType = conf.DATA_TYPE[prop['DATA_TYPE']]
		comment  = prop['COLUMN_COMMENT']
		# objs
		objs = objs + '    /** %s */\n' % (comment)
		objs = objs + '    public %s %s;\n' % (dataType, propName)
		# methods
		# getter
		methods = methods \
			+ '    public %s get%s() {\n' % (dataType, propName[0].upper() + propName[1:]) \
			+ '        return this.%s;' % (propName) \
			+ '\n    }\n\n'
		# setter
		methods = methods \
			+ '    public void set%s(%s %s) {\n' % (propName[0].upper() + propName[1:], dataType, propName) \
			+ '        this.%s = %s;' % (propName, propName) \
			+ '\n    }\n\n'
	return objs, methods

SELF_CODE_START = '// -*- SELF CODE START -*-\n'
SELF_CODE_END   = '// -*- SELF CODE END -*-\n'
def getSelfCode(filePath) :
	rFile = open(filePath, encoding='utf-8')
	selfCode = ''
	flag = False
	for line in rFile.readlines() :
		if line == SELF_CODE_END :
			flag = False
		if flag :
			selfCode = selfCode + line
		if line == SELF_CODE_START :
			flag = True
	rFile.close()
	return selfCode

# gen objects and methods
objs, methods = genObjsAndMethods()
filePath = conf.FILE['PATH'] + conf.DOMAIN['NAME'][0] + conf.DOMAIN['NAME'][1:].lower() + '.java'
# test path
# filePath = conf.DOMAIN['NAME'][1:].lower() + '.java'
selfCode = '// ' + str(time.time())
if os.path.exists(filePath):
	# handle self code
	selfCode = getSelfCode(filePath)

result = conf.FILE['TITLE'] + conf.FILE['CLASS'] + '%s'%(objs) + '\n' + '%s' % (methods) \
	+ SELF_CODE_START + '%s\n' % (selfCode) + SELF_CODE_END + '}'

file = open(filePath, 'w', encoding='utf-8')
file.write(result)
file.close()