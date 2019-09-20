#include<iostream.h>
#include<conio.h>
void main()
{
  clrscr();
  cout<<" enter the number";
  int y;
  cin>>y;
  for(int i=1;i<=y;i++)
  {
     if(i%15==0)
     cout<<"fizzbuzz";
     else if(i%3==0)
     cout<<"fizz";
     else if(i%5==0)
     cout<<"buzz";
     else
     cout<<i;
  }
  getch();
  }
