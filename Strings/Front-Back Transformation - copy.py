Given a string S, consisting only of english alphabets, replace all the alphabets with the alphabets occuring at the same position when counted in reverse order of alphabets. For example, 'a' would be replaced by 'z', 'b' by 'y', 'c' by 'x' and so on. Any capital letters would be replaced by capital letters only.

 

Example 1:

Input: S = "Hello"
Output: Svool

def convert(s):
        # code here
       corr = ''.join([chr(i) for i in range(97,123)])
       rev = corr[::-1]
       res = ''
       for i in s:
          if i.isupper():
             res += rev[corr.index(i.lower())].upper()
          else:    
             res += rev[corr.index(i)]
       return res   
print(convert("Hello"))  #Svool     
       
