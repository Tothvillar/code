#直接用{}来创建
s={21,12,12,312,21,123}
print(s)
#内置函数set()，set()可以把字典，列表，集合，字符串，元组转化成集合。
'''可用in/not in，检验集合中的元素
可用add（）加一个元素
可用update（）加至少一个元素'''
s.add(102)
print(s)
s.update({1000,299})#update还可添加元组和列表于集合中
print(s)
#集合的删除有remove()，discard(),pop(),clear()
#discard()不会报错，remove()会，pop()不加参数，随机删一个，clear会把所以全部清空
#集合无序
#issubset能判断一个集合是否为另一个集合的子集
#issuperset能判断一个集合是否为另一个集合的超集
#isdisjoint来判断是否有交集，没有交集为ture,有交集为false
'''----集合生成式----'''
c={i**2 for i in range(5)}
print(c,type(c))
