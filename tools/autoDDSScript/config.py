# conf.py
#!/user/bin/env python3
# -*- conding: utf-8 -*-

'conf.py'
'@author LiuChen'

import time

# get class name
# eg: ABC   => Abc
#	  A_B_C => ABC
#	  A_BC  => ABc
def getClassName(str) :
	ss = str.split('_')
	if len(ss) > 1 :
		return ss[0][0] + ss[0][1:].lower() + ss[1][0] + ss[1][1:].lower()
	else :
		return str(ss)

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
		getClassName(DOMAIN['NAME']), 
		time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()),
		time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()),
		DB['NAME'],
		getClassName(DOMAIN['NAME']),
		time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()),
	),
	'CLASS' : 
'''public class %s {\n''' % (getClassName(DOMAIN['NAME'])),
	'NAME' : getClassName(DOMAIN['NAME']),
}