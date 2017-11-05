# autoGen.py
#!/user/bin/env python3
# -*- conding: utf-8 -*-

'autoGen.py'
'@author LiuChen'

import os
import glob
import time

import config

path = config.FILE['PATH']
SUFFIX = '*.java'

# scan path and get all files with the suffix
def scanFilenames(path, suffix = SUFFIX) :
	files = glob.glob(path + suffix)
	filenames = []
	for file in files :
		filenames.append(os.path.basename(file).split('.')[0])
	return filenames

#### STEP ONE ####
# scan path DOMAIN
domainNames = scanFilenames(path + 'domain/')

#### STEP TWO ####
# constants
DAO_PATH = path + '/dao/'
SERVICE_PATH = path + '/service/'

IMPORT = '''
import org.springframework.stereotype.Component;
'''
ANNOTATION = '''
@Component'''
# public methods
def genBody(params) :
	name = params['filename']
	imp = params['imp']
	package = params['package']
	annotation = params['annotation']
	clazz = params['clazz']
	t = time.strftime("%Y-%m-%d %H:%M:%S", time.localtime())
	return config.FILE['TITLE'] % \
		(name, t, t, package, imp, name, t, annotation, clazz, name) + '    \n}'

# generate DAO file
def genDaoName(name) :
	return 'I' + name + 'Dao'

daoNames = scanFilenames(path + 'dao/')
for name in domainNames :
	daoName = genDaoName(name)
	if daoName not in daoNames :
		# doesn't have, then generate a new DAO file
		file = open(DAO_PATH + daoName + '.java', 'w', encoding='utf-8')
		file.write(genBody( \
			{'filename' : daoName, 'imp' : IMPORT, 'annotation' : ANNOTATION, 'package' : 'dao', 'clazz' : 'interface'} \
			))
		file.close()

# generate SERVICE file
def genServiceName(name) :
	return 'I' + name + 'Service'

serviceNames = scanFilenames(path + 'service/')
for name in domainNames :
	serviceName = genServiceName(name)
	if serviceName not in daoNames :
		# doesn't have, then generate a new SERVICE file
		file = open(SERVICE_PATH + serviceName + '.java', 'w', encoding='utf-8')
		file.write(genBody( \
			{'filename' : serviceName, 'imp' : '', 'annotation' : '', 'package' : 'service', 'clazz' : 'interface'} \
			))
		file.close()