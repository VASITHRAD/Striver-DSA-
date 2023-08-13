a=1
b=1
c=0
n=int(input())
li=[]
li.append(a)
li.append(b)
for i in range(0,n):
    c=a+b
    li.append(c)
    a=b
    b=c
print(li[n-1])
