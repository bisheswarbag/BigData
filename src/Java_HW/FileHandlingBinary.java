package Java_HW;
import java.io.*;

public class FileHandlingBinary {
	public static void main(String []args)throws Exception
	{
		File file=new File("F:/BIS_BIGDATA/File_handle/binary.txt");
		if(file.exists())
		{
			file.delete();
		}
		else
			file.createNewFile();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("F:/BIS_BIGDATA/File_handle/binary.txt"));
		int y = 2013;
		double z=2.33;
		bw.write(y);
		bw.write((int) z);
		System.out.print(y);
		System.out.println(z);
		bw.close();
		
	}
}
