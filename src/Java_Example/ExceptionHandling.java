//use of finally is in every case if it runs or it shows an exception

package Java_Example;
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String []args)
	{   
		Scanner s1=new Scanner(System.in);
		int a,b,c;
		try
		{
           System.out.println("Enter 2 no. ");
         a=s1.nextInt();
         b=s1.nextInt();
		try
		{
		 c=a/b;
		}
		catch(Exception e)
		{
			c=a+b;
			System.out.println("Arithematic exception "+c);
		}
		}
		catch(Exception e2)
		{
		    System.out.println("String type variable exception");
		}
		finally
		{
			System.out.print(" Finally executed ");
		}
		
}
}

