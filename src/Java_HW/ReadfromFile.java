package Java_HW;
import java.io.*;
public class ReadfromFile {
	public static void main(String []args) throws Exception
	{
		FileInputStream file=new FileInputStream("F:/BIS_BIGDATA/newFile.txt ");
				int i;
		     
				do
				{
					i=file.read();
					if(i!=-1)
						
					System.out.println((char)i );//type casting
				}
				while(i!=-1);
				file.close();
			     
			
				
	}

}
