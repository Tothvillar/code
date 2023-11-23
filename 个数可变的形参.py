#个数可变的位置参数
def fun(*args):#只能定义一个
    print(args)
fun(11)
fun(12,123)
#个数可变的关键字参数
def fun1(**args):#只能定义一个
    print(args)
fun1(a=10)
fun1(a=20,b=10,c=30)
'''两者可同时用，但要按顺序'''