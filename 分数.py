score=int(input('---请输入一个分数'))
if score>=90 and score<=100:
    print('A级')
elif score>=80 and score<90:
    print('B级')
elif score>=70 and score<80:
    print('C级')
elif score>=60 and score<70:
    print('D级')
elif score<60:
    print('E级')
else:
    score>100 and score<0
    print('错误，请重新输入')