package Java_HW;
import java.nio.file.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputNoScanner {
	public static void main(String []args) throws IOException
	{   
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(ir);

		
		String name="";
		int age;
		int    custID;
		String PhNo="";
		float Salary;
		System.out.println("Enter your name ");
		name=br.readLine();
		System.out.println("Enter your ID ");
		custID=Integer.parseInt(br.readLine());
		System.out.println("Enter your Salary ");
		Salary=Float.parseFloat(br.readLine());
		System.out.println("Enter your Phone number ");
		PhNo=br.readLine();
		System.out.println("Enter your Age ");
		age=Integer.parseInt(br.readLine());
		
		System.out.println("Entered detail are  " +name);
		System.out.println(Salary);
		System.out.println(age);
		System.out.println(PhNo);
		System.out.println(custID);
		
		
	}
  	

}
