//RESOURCE LEAKING// try with resources, objects become resources in IO Operations// In exception we cannot close the resources
//java 1.7 //need not to create a finally block if closing only one resource instead write argument with the try (itself)

package Java_Example;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionResourceEnding  
 {
	public static void main(String [] args) throws Exception
	{	
	 int age;
	 try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
	 {
	 //InputStreamReader io=new InputStreamReader(System.in);
    // BufferedReader br=new BufferedReader(io);
     System.out.println("enter your age ");
     age=Integer.parseInt(br.readLine());
     System.out.println("hello"+age);
     
	 }
	 catch(Exception e)
	 {
		 System.out.println("Enter numeric type data");
	 }
	// finally
	// {
	//	 br.close();
	// }
	 
	 
	}
}
