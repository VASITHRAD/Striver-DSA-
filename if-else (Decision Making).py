from typing import *

def compareIfElse(a: int, b: int):
    # Write your code here\
    if a>b:
        de="greater"
    elif a==b:
        de="equal"
    elif a<b:
        de="smaller"
    return de
    
