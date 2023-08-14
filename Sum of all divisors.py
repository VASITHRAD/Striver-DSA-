def sumOfAllDivisors(n: int) -> int:
    # Write your code here
    s=0
    for i in range(1,n+1):
        for j in range(1,i+1):
            if i%j==0:
                #print(i,j)
                s+=j
    return s
