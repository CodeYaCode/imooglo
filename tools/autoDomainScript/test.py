district = 0
company  = 1
doctor   = 2
address  = 3
legal    = 4
phone    = 5

file = open('hospital', 'r', encoding='utf-8')


for line in file.readlines():
	hos = line.strip('\n').split('\t')
	print(hos)
