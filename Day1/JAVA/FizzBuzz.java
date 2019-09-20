import java.util.Scanner;

public class FizzBuzz {
	
	public static void main(String ar[]) 
	{	
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter The Number Of Terms You Want In The Output");
		int i=scn.nextInt();
		for(int no=1;no<i;no++)
		{
			if(no%15==0)
				System.out.print("FizzBuzz ");
			else if(no%5==0)
				System.out.print("Buzz ");
			else if(no%3==0)
				System.out.print("Fizz ");
			else 
				System.out.print(no+" ");
		}
	}	

}
