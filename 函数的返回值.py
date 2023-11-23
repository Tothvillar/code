def fun(num):
    odd=[]
    even=[]
    for i in num:
        if i%2:
            odd.append(i)
        else:
            even.append(i)
    return odd,even
a=[12,321,43,123,345,91]
print(fun(a))
'''
函数的返回值
（1）如果函数没有返回值【函数执行完毕之后，不需要给调用处提供数据】return可以省略不写
（2）函数的返回值，如果是一个，直接返回类型
（3）函数的返回值，如果是多个，返回结果是元组
'''