def countDigits(n: int) -> int:
    li=[]
    s=0
    for i in str(n):
        li.append(str(i))
    x=n%10
    if (x!=0):
        for j in range(0,len(li)):
            if (n%int(li[j])==0):
                s+=1
    else:
        for j in range(0,len(li)-1):
            if (n%int(li[j])==0):
                s+=1
        
    return s
