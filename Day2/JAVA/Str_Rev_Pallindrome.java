  /**
        * @author: Vinay-Tare
        * @date: 21/09/2019 
 **/
import java.util.Scanner;
public class Str_Rev_Pallindrome 
{
    static String Rev_Str(String str)
    {   int length=str.length();
        String Rev_Str="";
        for(int i=0;i<length;i++)
            Rev_Str+=str.charAt(length-1-i);
        return Rev_Str;
    }
    static void Check_Pallindrome(String str,String Rev_Str)
    {
    	int length=str.length();
    	int i;
    	for(i=0;i<length;i++)
    	{
    		if(str.charAt(i)!=Rev_Str.charAt(i))
    		{
    			System.out.println("Entered String Is Not A Pallindrome");
    			break;
    		}
    		
    	}
    	
    	if(i==length)
    		System.out.println("The Entered String Is A Pallindrome");
    }
    public static void main(String ar[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter The String You Want To Reverse:");
        String str=scn.nextLine();
        String Reversed_String=Rev_Str(str);
        System.out.println("Reversed String Is:"+Reversed_String);
        System.out.println("Checking String For A Pallindrome In Case Sensitive Manner");
        Check_Pallindrome(str,Reversed_String);
        
    }
}
