package Java_HW;

import java.io.BufferedReader;
import java.io.*;

public class ReadDataWriteFile {
	// Q6. Reading Data from File and writing to Standard Output Device?

	public static void main(String[] args) throws Exception {

		byte CustId;
		String CustName;
		int CustAge;
		float Custbal;
		float CustSal;
		char grade;

		try {
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);

			System.out.println("Enter Customer Id");
			CustId = Byte.valueOf(br.readLine()); // this kind of program needs
													// exception //

			System.out.println("Enter Customer Name");
			CustName = br.readLine();

			System.out.println("Enter Customer Age");
			CustAge = Integer.parseInt(br.readLine());

			System.out.println("Enter Customer Salary");
			CustSal = Float.parseFloat(br.readLine());

			System.out.println("Enter Customer Grade");
			grade = (char) (br.read());

			// System.out.println("Id Is "+CustId);
			System.out.println("Id Is " + CustName);
			System.out.println("Id Is " + CustAge);
			// System.out.println("Id Is "+CustSal);
			// System.out.println("Id Is "+grade);

			FileOutputStream fobj = new FileOutputStream("d:\\demo.txt");
			fobj.write(CustId);
			fobj.write(CustName.getBytes());
			fobj.write(CustAge);
			// fobj.write(Integer.parseInt(CustSal));
			fobj.write(grade);

		} catch (Exception ex) {
			System.out.println(ex.toString());
		}

	}
}

/*
 * throws is used for exception, file inputstream tends to have errors
 * 
 * {
 * 
 * String name = "Hello Java Students....";
 * 
 * FileOutputStream fout = new
 * FileOutputStream("/Users/saurabhjawa/Desktop/NIITJAVA/Test.doc");
 * 
 * byte b[] = name.getBytes();
 * 
 * fout.write(b);
 * 
 * 
 * int i =0;
 * 
 * FileInputStream fin = new
 * FileInputStream("/Users/saurabhjawa/Desktop/NIITJAVA/Test.doc");
 * 
 * 
 * while((i=fin.read())!=-1)
 * 
 * {
 * 
 * System.out.print((char)i);
 * 
 * }
 * 
 * }
 * 
 * } }
 */