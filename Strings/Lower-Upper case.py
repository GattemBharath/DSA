def to_upper(str):
    #return str.upper()
    s = ''
    for i in str:
        s += chr(ord(i)-32)
    return s
print(to_upper('geeksforgeeks'))