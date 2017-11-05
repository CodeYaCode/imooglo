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
def getClassName(s) :
	ss = s.split('_')
	if len(ss) > 1 :
		return ss[0][0] + ss[0][1:].lower() + ss[1][0] + ss[1][1:].lower()
	else :
		return str(ss[0])
FILE = {
	# Your local project path
	'PATH' : 'E:/liuchen/imooglo/tools/test/',
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
package com.imooglo.%s;
%s
/**
 * %s.java
 * Auto Generate By Chen
 *
 * @author LiuChen
 * @version 1.0.0.0 %s
 */%s
public %s %s {
''',
}