
  /**
        * @author: Vinay-Tare
        * @date: 26/09/2019
  **/
import java.util.Scanner;
public class Hamming_Distance {
	String s1,s2;
	int distance;
	Hamming_Distance()
	{	System.out.println("====== HAMMING DISTANCE FINDER ======");
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter The 1st String");
		s1=scn.next();
		System.out.println("Enter The 2nd String");
		s2=scn.next();
	}
	int H_D()
	{
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
				distance++;
		}
		return distance;
	}
	public static void main(String ar[])
	{
		Hamming_Distance obj=new Hamming_Distance();
		System.out.println(obj.H_D());
	}
}