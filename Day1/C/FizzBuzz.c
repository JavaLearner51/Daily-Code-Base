/**
        * @author: Vinay-Tare
        * @date: 20/09/2019
**/

#include<stdio.h>
#include<conio.h>

void main()
{
int i,no;
clrscr();
printf("Enter The No. Of Terms To Be Printed");
scanf("%d",&i)	;
 for(no=1;no<i;no++)
 {
 if(no%5==0 && no%3==0)
 printf("FizzBuzz ");
 else if(no%5==0)
 printf("Buzz ");
 else if(no%3==0)
 printf("Fizz ");
 else
 printf("%d ",no);
 }
getch();
}

