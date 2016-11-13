package Java_HW;
import java.io.*;
import java.util.*;
public class FileHandlingPrintWriter {
	public static void main(String []args) //throws Exception
	{   
		//FileWriter fw =null;
		try
		{
		PrintWriter pw=new PrintWriter(new FileWriter("F:/BIS_BIGDATA/File_handle/FileHandlingPrintWriter.txt",true));
		//BufferedWriter bw=new BufferedWriter(pw);
		pw.println("rajuhacha");
		pw.println(10.2);
		pw.println(100);
		pw.println(true);
		
		
		}
		catch(Exception ex)
		{
			System.out.println(" file not found ");
		}
		
		
		
	}

}
