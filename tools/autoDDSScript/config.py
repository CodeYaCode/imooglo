# conf.py
#!/user/bin/env python3
# -*- conding: utf-8 -*-

'conf.py'
'@author LiuChen'

import time

FILE = {
	# Your local project path
	# 'PATH' : 'D:/liuchen/imooglo/backend/imooglo/tools/test/',
	'PATH' : 'D:/liuchen/imooglo/backend/imooglo/src/main/java/com/imooglo/',
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
public %s %s%s%s {
    %s
}
''',
	'DATA' :
'''
    /**
     * %s
     * @return
     */
    %s get%s();
''',
	'GETTER' :
'''
    @Override
    public %s get%s() {
        return %s;
    }
'''
}