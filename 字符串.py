a='12387443'
b='12387443'
print(a is b)
c=''.join([a,b])
print(c)#建议使用join（），效率较高

'''字符串的查询方法'''
'''1.index()查找最第一次出现位置。
2.rindex()查找最后一次出现位置。找不到会报异常
3.find()查找最第一次出现位置。
4.rfind()找查找最后一次出现位置。不到会返回-1
'''
s='hello,hello'
print(s.index('o'))
print(s.rindex('o'))
print(s.find('o'))
print(s.rfind('o'))

'''大小写转换'''
'''1.upper()所有转大 2.lower()所有转小 3.swapcase()大转小，小转大 
4.capitalize第一转大，其他转小 5.title()每个单词第一个转大写，其他转小写'''
a='Hello,Python'
print(a.upper())
print(a.lower())
print(a.capitalize())
print(a.swapcase())
print(a.title())
print(id(a.upper()))
#字符串id会变化，因为其不可变

'''字符串中对齐方法'''
'''1.center()居中对齐，1指宽度 2指填充符
2.ljust()左对齐，1指宽度 2.指填充符       填充符不写默认空格，小于等于原字符为其本身
3.rjust()右对齐，1指宽度 2.指填充符
4.zfill()右对齐，左边用0填充，'''
a='Hello,Python'
print(a.center(30,'-'))
print(a.ljust(30,'-'))
print(a.rjust(30,'-'))
print(a.zfill(30))

'''字符串的劈分'''
'''1.split()从左开始分割，没有指定分割符就为空格，可通过sep=指定，可通过maxsplit=指定最大分割数
2.rsplit()从右开始分割，没有指定分割符就为空格，可通过sep=指定，可通过maxsplit=指定最大分割数'''
a='Hello Python world'
print(a.split())
a='Hello,Python,world'
print(a.split(sep=',',maxsplit=1))
a='Hello Python world'
print(a.rsplit())
a='HelloPythonxiaworld'
print(a.rsplit(sep=',',maxsplit=1))

'''字符串的操作方法'''
print('1.',a.isidentifier())#isindentifier（）判断标识符是否合法（字母，数字，下划线）
print('2.',' '.isspace())#isspace()判断是否为空白字符
print('3.','aldjs'.isalpha())#isalpha判断是否全部由字母组成
print('4.','100'.isdecimal())#isdecimal判断是否由十进制数组成     汉字也为字母
print('5.','123四'.isnumeric())#isnmeric判断是否由数字组成
print('6.','123x'.isalnum())#isalnum判断是否由数字和字母组成

'''字符串的替换和合并'''
c='hello,python'
print(c.replace(',python',''))#若有几个替换对象后面加,替换次数
d=['hello','java','python']
print(','.join(d))
f=('hello','java','python')
print(','.join(f))#join可连接元组或者列表的字符串

'''字符串的比较'''
print('apple'>'app')#从第一字符开始比较，若相等则继续比较，直到不相等
print('apple'>'banana')#比较的是ordinal value，用内置函数ord获取
print(ord("陈"))
print(chr(100),chr(101))#chr()可通过ordinal value获取字符串
print(chr(38472))
'''==比较的是value，is比较的是id'''

'''字符串的切片'''
g='hello,python'
g1=g[:5]
g2=g[6:]
g3='!'
new=g1+g2+g3
print(new)
print(id(g),id(g1),id(g2),id(g3),id(new))
'''-----------------切片[start:end:step]----------------'''
g4=g[1:6:2]#若没有写开始从索引为0开始，没有写结束默认到字符串最后一个结束，步长为1
print(g4)
print(g[-6::])#默认从截取到结束，从-6开始
print(g[6::])
'''格式化字符串'''
#1.%s为字符串，%i或者%d为整数，%f为浮点数
name='zhangsan'
age='20'
print('我叫%s，今年%d岁'%(name,int(age)))
#{}做占位符format
print('我叫{0}，今年{1}岁'.format(name,age))
#f-string
print(f'我叫{name}，今年{age}岁')
print('%10d'% 99)#表宽度
print('%.4f'% 3.14159265)#表小数点后几位，可同时
print('{0:.3}'.format(3.14159265))#.3代表一共保留3位数，.3f表示的是三位小数，同时还可以设置精度
'''字符串的编码与解码'''
p='天涯共此时'
#编码
print(p.encode(encoding='GBK'))#在GBK这种编码中一个中文占两个字节
print(p.encode(encoding='UTF-8'))#在UTF-8中一个中文占三个字节
#解码
byte=p.encode(encoding='GBK')
print(byte.decode(encoding="GBK"))















