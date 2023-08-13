a=input()
se=0
so=0
for i in a:
    if int(i)%2 ==0:
        se+=int(i)
    else:
        so+=int(i)
print(se,so)
