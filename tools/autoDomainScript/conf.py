# conf.py
#!/user/bin/env python3
# -*- conding: utf-8 -*-

'conf.py'
'@author LiuChen'

import time

DB = {
	'HOST' 	  : '127.0.0.1',
	'PORT' 	  : '3306',
	'USER' : 'root',
	'PWD' : '123456',
	'NAME' 	  : 'imooglo',
	'CHARSET'  : 'utf8',
}

DOMAIN = {
	# edit, upper
	'NAME' : 'HOSPITAL',
}

DATA_TYPE = {
	'int' 		: 'int',
	'varchar'   : 'String',
	'timestamp' : 'long',
	'double'    : 'double',
}

FILE = {
	# Your local project path
	'PATH' : 'D:/liuchen/imooglo/backend/imooglo/src/main/java/com/imooglo/domain/',
	'TITLE' : 
'''/*
 * $Header: %s.java
 * $Revision: 1.0.0.0
 * $CreateDate: %s
 * $ModifyDate: %s
 * $Owner: LiuChen
 * 
 * Copyright (c) 2017-2027 ShangHai ChenJxx Co. Ltd.
 * All Right Reserved.
 */
package com.%s.domain;

/**
 * %s.java
 * Auto Generate By Chen
 *
 * @author LiuChen
 * @version 1.0.0.0 %s
 */
''' % (
		DOMAIN['NAME'][0] + DOMAIN['NAME'][1:].lower(), 
		time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()),
		time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()),
		DB['NAME'],
		DOMAIN['NAME'][0] + DOMAIN['NAME'][1:].lower(), 
		time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()),
	),
	'CLASS' : 
'''public class %s {\n''' % (DOMAIN['NAME'][0] + DOMAIN['NAME'][1:].lower())
}