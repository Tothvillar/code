def fun3():
    global age#global可把局部变量变为全局变量
    age=20
    print(age)
fun3()
print(age)