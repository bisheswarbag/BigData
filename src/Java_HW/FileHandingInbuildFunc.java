package Java_HW;
import java.io.*;
public class FileHandingInbuildFunc {
	public static void main(String[] args) throws Exception
	
	
	
	{	

	File f1=new File("F://BIS_BIGDATA/File_handle/Bisheswar.txt");
	f1.createNewFile();
	File[]list= f1.listFiles();
	System.out.println(f1.canWrite());
	System.out.println(f1.canRead());
	}

}
