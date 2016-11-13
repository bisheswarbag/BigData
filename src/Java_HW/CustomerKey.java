package Java_HW;


	//Q8. Write a program to accept the Customer Details from Key Board and Write it to File?

	import java.io.BufferedReader;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.InputStreamReader;
	import java.io.BufferedWriter;
	import java.io.*;
	
	public class CustomerKey{


	private static final String CustId = null;

	public static void main(String[] args) throws Exception
	//throws is used for exception, file inputstream tends to have errors
	{
	String CustA;
	String CustName;
	int CustAge;
    

	try
	{
	InputStreamReader is = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(is);
	FileOutputStream fout = new FileOutputStream("/Users/saurabhjawa/Desktop/NIITJAVA/CustomerDetails.doc");

	System.out.println("Enter Customer Name");
	CustName = br.readLine();
	fout.write(CustName.getBytes());

	System.out.println("Enter Customer Age");
	CustA = br.readLine();
	byte b[] = CustId.getBytes();
	fout.write(b);

	System.out.println("Enter Customer Age");
	CustAge = Integer.parseInt(br.readLine());
	fout.write(CustAge);





	System.out.println("Id Is "+CustId);
	System.out.println("Id Is "+CustName);
	System.out.println("Id Is "+CustAge);

	}
	catch(Exception ex)
	{
	System.out.println(ex.toString());
	}

	}

}
