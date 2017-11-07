# autoGen.py
#!/user/bin/env python3
# -*- conding: utf-8 -*-

'autoGen.py'
'@author LiuChen'

import os
import glob
import time

import config

######################### CONSTANTS #########################
PATH = config.FILE['PATH']
SUFFIX = '*.java'
DAO_PATH = PATH + 'dao/'
SERVICE_PATH = PATH + 'service/'
SERVICE_IMPL_PATH = SERVICE_PATH + 'impl/'

IMPORT = '''
import org.springframework.stereotype.Component;
'''
IMP_AUTO_SERVICE = '''
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooglo.service.IDataGetterService;
'''
IMP_SERVICE_IMPL = '''
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooglo.service.IDataGetterService;
import com.imooglo.service.%s;
'''
ANNOTATION = '''
@Component'''
ANNO_SERVICE = '''
@Service'''
ANNO_AUTOWIRED = '''
	@Autowired'''
AUTOWIRED_DATAGETTER = '''
    @Autowired
    public IDataGetterService dataGetterService;'''
I_DATAGETTER_NAME = 'IDataGetterService'
DATAGETTER_IMPL_NAME = 'DataGetterService'
#############################################################

# public methods
# scan path and get all files with the suffix
def scanFilenames(p, suffix = SUFFIX) :
	files = glob.glob(p + suffix)
	filenames = []
	for file in files :
		filenames.append(os.path.basename(file).split('.')[0])
	return filenames

def genBody(params) :
	name = params['filename']
	imp = params['imp']
	package = params['package']
	annotation = params['annotation']
	clazz = params['clazz']
	t = time.strftime("%Y-%m-%d %H:%M:%S", time.localtime())
	extends = params['extends']
	implements = params['implements']
	content = params['content']
	return config.FILE['TITLE'] % \
		(name, t, t, package, imp, name, t, annotation, clazz, name, extends, implements, content)

#### STEP ONE ####
# scan path DOMAIN
domainNames = scanFilenames(PATH + 'domain/')

#### STEP TWO ####
# generate DAO file
def genDaoName(name) :
	return 'I' + name + 'Dao'

daoNames = scanFilenames(DAO_PATH)
if not os.path.exists(DAO_PATH) :
	os.mkdir(DAO_PATH)
for name in domainNames :
	daoName = genDaoName(name)
	if daoName not in daoNames :
		# doesn't have, then generate a new DAO file
		file = open(DAO_PATH + daoName + '.java', 'w', encoding='utf-8')
		file.write(genBody({
			'filename' : daoName,
			'imp' : IMPORT,
			'annotation' : ANNOTATION,
			'package' : 'dao',
			'clazz' : 'interface',
			'extends' : '',
			'implements' : '',
			'content' : '',
			}))
		file.close()

# generate SERVICE file
def genServiceName(name) :
	return 'I' + name + 'Service'

serviceNames = scanFilenames(SERVICE_PATH)
if not os.path.exists(SERVICE_PATH) :
	os.mkdir(SERVICE_PATH)
for name in domainNames :
	serviceName = genServiceName(name)
	if serviceName not in serviceNames :
		# doesn't have, then generate a new SERVICE file
		file = open(SERVICE_PATH + serviceName + '.java', 'w', encoding='utf-8')
		file.write(genBody({
			'filename' : serviceName,
			'imp' : '',
			'annotation' : '',
			'package' : 'service',
			'clazz' : 'interface',
			'extends' : '',
			'implements' : '',
			'content' : '',
			}))
		file.close()

# generate SERVICE.IMPL file
def genServiceImplName(name) :
	return name

serviceNames = scanFilenames(SERVICE_PATH)
serviceImplNames = scanFilenames(SERVICE_IMPL_PATH)
if not os.path.exists(SERVICE_IMPL_PATH) :
	os.mkdir(SERVICE_IMPL_PATH)
for name in serviceNames :
	serviceImplName = genServiceImplName(name[1:])
	if serviceImplName not in serviceImplNames and not name == I_DATAGETTER_NAME:
		# doesn't have, then generate a new SERVICE.IMPL file
		file = open(SERVICE_IMPL_PATH + serviceImplName + '.java', 'w', encoding='utf-8')
		file.write(genBody({
			'filename' : serviceImplName,
			'imp' : IMP_SERVICE_IMPL % ('I' + serviceImplName),
			'annotation' : ANNO_SERVICE,
			'package' : 'service.impl',
			'clazz' : 'class',
			'extends' : '',
			'implements' : ' implements' + ' I%s' % (serviceImplName),
			'content' : AUTOWIRED_DATAGETTER,
			}))
		file.close()


# generate IDataGetterService file
if not os.path.exists(SERVICE_PATH) :
	os.mkdir(SERVICE_PATH)
imp = '\n'
daos = []
services = []
# scan again, in case that there isn't any dao or service file in the first scanning.
daoNames = scanFilenames(DAO_PATH)
serviceNames = scanFilenames(SERVICE_PATH)
for name in daoNames :
	daos.append(name)
	imp = imp + 'import com.imooglo.dao.' + name + ';\n'
for name in serviceNames :
	services.append(name)
	if not name == I_DATAGETTER_NAME :
		imp = imp + 'import com.imooglo.service.' + name + ';\n'
methodDao = ''
methodService = ''
for dao in daos :
	methodDao = methodDao + config.FILE['DATA'] % (dao, dao, dao[1:])
for service in services :
	if service == I_DATAGETTER_NAME :
		continue
	methodService = methodService + config.FILE['DATA'] % (service, service, service[1:])
file = open(SERVICE_PATH + I_DATAGETTER_NAME + '.java', 'w', encoding='utf-8')
file.write(genBody({
		'filename' : I_DATAGETTER_NAME, 
		'imp' : imp, 
		'annotation' : '',
		'package' : 'service',
		'clazz' : 'interface',
		'extends' : '',
		'implements' : '',
		'content' : methodDao + methodService,
		}))
file.close()

# generate DataGetterServiceImpl file
if not os.path.exists(SERVICE_IMPL_PATH) :
	os.mkdir(SERVICE_IMPL_PATH)
file = open(SERVICE_PATH + I_DATAGETTER_NAME + '.java', 'r', encoding='utf-8')
classes = []
for line in file.readlines() :
	if line.strip('\n')[-3:] == '();' :
		classes.append(line.split(' ')[4])
props = ''
methods = ''
imp = imp + IMP_AUTO_SERVICE
for cla in classes :
	props = props + (ANNO_AUTOWIRED + "\n    public %s %s;\n" % (cla, cla[1].lower() + cla[2:]))
	methods = methods + config.FILE['GETTER'] % (cla, cla[1:], cla[1].lower() + cla[2:])
file = open(SERVICE_IMPL_PATH + DATAGETTER_IMPL_NAME + '.java', 'w', encoding='utf-8')
file.write(genBody({
		'filename' : DATAGETTER_IMPL_NAME, 
		'imp' : imp, 
		'annotation' : ANNO_SERVICE,
		'package' : 'service.impl',
		'clazz' : 'class',
		'extends' : '',
		'implements' : ' implements ' + I_DATAGETTER_NAME,
		'content' : props + methods,
		}))
file.close()