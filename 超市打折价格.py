answer=input('是否有会员卡yes/no')
money=float(input('请输入您的购物金额'))
if answer=='yes':
   if money>=200:
       print(money*0.8)
   elif 100<=money<200:
       print(money*0.9)
   elif 0<=money<100:
       print(money)
else:
   if money>=200:
       print(money*0.95)
   else:
       print(money)