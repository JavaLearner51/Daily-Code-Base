#include<conio.h>
using namespace std;
#include<iostream>
#include<stdlib.h>
class Fizzbuzz
{
public:

 Fizzbuzz();
 
  void Shownumber(int );
};

Fizzbuzz:: Fizzbuzz()
{ 
cout<<"\nTHIS PROGRAM IS ABOUT IF A NUMBER IS\n"
    <<"\n1)MULTIPLE OF 3  PRINT ==>> FIZZ\n"
	  <<"\n2) MULTIPLES OF 5 ==>> BUZZ\n"
	  <<"\n3)MULTIPLES OF 3 & 5 BOTH==>> FIZZ BUZZ\n\n\n";
	  
}
   void Fizzbuzz:: Shownumber(int v )
	{
	for (int i=1;i<v;i++)
	{
	
	if((i%3==0)&&(i%5==0))
	

	cout<<"FIZZBUZZ,";

	else if(i%3==0)
		cout<<"FIZZ,";
	
	else if(i%5==0)
		cout<<"BUZZ,";
		else 
		cout<<i<<",";
	 

	}
	}    
	   int main()
       {
         int n;
		 
          
          cout<<"\nWANA PLAY THE NUMBER GAME TILL WHICH DIGIT\n";
          cin>>n;
             
         Fizzbuzz O1;
         
	
		
		 O1.Shownumber(n);
	     
	     
		 		
				getch();
				return 0;
			}
	   
