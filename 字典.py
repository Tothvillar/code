'''字典有2种创建方式
1.直接用{}创建
2.创建dict()'''
a={"关键":100,"创作":9000}
print(a)
b=dict(name='值',age='年龄')
print(b)
'''字典元素获得'''
'''1.[],2.get()'''
print(a["关键"])
print(a.get("关键"))
#若键不存在，1.会报错，2.会显示none
#用del，clear（）可以做字典的删除
#可以用a['键']=num加元素，也可以做修改

'''-----字典试图的三个方法-------
1.keys（）获取键2.values（）获取值3.item（）元组组成，可通过；list（）转发成列表'''

'''字典的遍历'''
for c in a:
    print(c,a[c],a.get(c))# 两种方法获取value
#而且key不允许重复，但是value可以重复，且无序，不可变对象
