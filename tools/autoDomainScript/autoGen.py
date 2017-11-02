# autoGen.py
#!/user/bin/env python3
# -*- conding: utf-8 -*-

'autoGen.py'
'@author LiuChen'

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
	# print('public ' + dataType + ' ' + propName + ';')
	# print(conf.DATA_TYPE[prop['DATA_TYPE']])

result = conf.FILE['TITLE'] + conf.FILE['CLASS'] + '%s'%(objs) + '\n' + '%s' % (methods) \
	+ '// SELF CODE START\n\n' + '// SELF CODE END\n' + '}'
filePath = conf.FILE['PATH'] + conf.DOMAIN['NAME'][0] + conf.DOMAIN['NAME'][1:].lower() + '.java'
file = open(filePath, 'w', encoding='utf-8')
file.write(result)