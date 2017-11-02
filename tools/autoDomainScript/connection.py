# connection.py
#!/user/bin/env python3
# -*- conding: utf-8 -*-

'connection.py'
'@author LiuChen'

import pymysql.cursors
import conf

host    = conf.DB['HOST']
user    = conf.DB['USER']
passwd  = conf.DB['PWD']
db      = conf.DB['NAME']
charset = conf.DB['CHARSET']
table   = conf.DOMAIN['NAME']

sql     = '''SELECT
				*
			FROM
				information_schema.`COLUMNS`
			WHERE
		   		TABLE_SCHEMA = '%s' AND TABLE_NAME = '%s';
		  ''' % (db, table)

def connection() :
	connection = pymysql.connect(host=host, user=user, password=passwd, db=db, charset=charset, cursorclass=pymysql.cursors.DictCursor)

	try:
		with connection.cursor() as cursor:
			cursor.execute(sql, ())
			result = cursor.fetchall()
			return result
	finally:
		connection.close()