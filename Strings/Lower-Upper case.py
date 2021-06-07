Given a string str containing only lowercase letters, generate a string with the same letters, but in uppercase.

Example 1:

Input:
str = "geeks"
Output: GEEKS
Example 2:

Input:
str = "geeksforgeeks"
Output: GEEKSFORGEEKS



def to_upper(str):
    #return str.upper()
    s = ''
    for i in str:
        s += chr(ord(i)-32)
    return s
print(to_upper('geeksforgeeks'))  # GEEKSFORGEEKS
