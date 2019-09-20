 #    @author: <GitHub Username>
 #    @date: <date>

i=int(input("Enter The No. Of Terms You Want"))
for no in range(1,i+1):
    if no%5==0 and no%3==0:
     print("FizzBuzz",end=' ')
    elif no%5==0:
     print("Buzz",end=' ')
    elif no%3==0:
     print("Fizz",end=' ')
    else:
     print(no,end=' ')
