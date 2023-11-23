sum=0
for a in range(1,10,1):
 for b in range(10):
  for c in range(10):
   if str(a)+str(b)+str(c)==str(a**3+b**3+c**3):
    sum+=1
print('水仙花数为',sum)

for item in range(100,1000):
    ge=item%10
    shi=item//10%10
    bai=item//100%10
    if ge**3+shi**3+bai**3==item:
     print('分别为',item)