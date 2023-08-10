def dataTypes(type):
    a=0
    if type.lower() =="long" or type.lower()== "double":
        a=8
    elif type.lower()== "float" or type.lower()== "integer":
        a=4
    
    elif type.lower()=="character":
        a=1
    return a

