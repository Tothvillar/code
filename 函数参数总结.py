def fun(a,b,c):
    print('a=',a)
    print('b=',b)
    print('c=',c)
fun(10,20,30)
lst=[11,22,33]
fun(*lst)#在调用是，将列表的美国元素都转换为位置实参传入
dict={'a':111,'b':222,'c':333}
fun(**dict)
def fun4(a,b,*,c,d):#从*以后都只能用关键字参数
    print('a=',a)
    print('b=',b)
    print('c=',c)
    print('d=',d)
fun4(10,20,c=30,d=40)