import java.util.Scanner;
public class Fizzbuzz 
{
public static void main (String ar[])
{
	Scanner obj=new Scanner(System.in);
	System.out.println("ENTER THE DIGIT UP TO WHICH PROGRAM SHOULD RUN");
	int no;
	no=obj.nextInt();
	
	for (int i=1;i<no;i++)
	{
	   if((i%3==0)&&(i%5==0))
	   System.out.println("FIZZBUZZ,");

	   else if(i%3==0)
	   System.out.println("FIZZ,");
	
	   else if(i%5==0)
	   System.out.println("BUZZ,");
	   
	   else 
       System.out.println(i+",");
	
}
}
}