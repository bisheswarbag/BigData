//create file and write data into file

package Java_HW;
import java.io.File;
import java.io.*;

public class WriteinFile {
	public static void main(String[] args) throws Exception
	{ 
		int i;
		FileOutputStream f1=new FileOutputStream("F:/BIS_BIGDATA/newFile.txt",true);
	    String str="Java classes";
	
		char ch[]=str.toCharArray(); //converts string into character array
		
		for (int j=0;j<12;j++)
		{
			f1.write(ch[j]);
			System.out.print(ch[j]);// Appends
		}
        f1.close();
		
	}

}
