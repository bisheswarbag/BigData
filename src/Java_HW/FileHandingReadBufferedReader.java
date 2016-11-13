//ask manjum sir

package Java_HW;
import java.io.*;

public class FileHandingReadBufferedReader {
		public static void main(String [] args) throws Exception
		{
			FileReader fr=new FileReader("F:/BIS_BIGDATA/File_handle/writeIntoFile.txt");
			BufferedReader br=new BufferedReader(fr);
			int ch=br.read();
			while(ch!=-1)
			{
				System.out.print((char)ch );
			}
			{
			fr.close();
			br.close();
		}
		
			//F:/BIS_BIGDATA/File_handle/coustomer4.txt
	}

}
