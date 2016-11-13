package Java_HW;

import java.io.*;
import java.util.*;

public class FhReadThirdnadForth {
	public static void main(String[] args) throws Exception

	{
		Scanner scan = new Scanner(System.in);
		File f1 = new File("F:/BIS_BIGDATA/File_handle/Showdetails4th3rd.txt");

		if (f1.exists()) {
			f1.delete();
		} else
			f1.createNewFile();
		// FileWriter fw = null;
		BufferedWriter bw = new BufferedWriter(new FileWriter("F:/BIS_BIGDATA/File_handle/Showdetails4th3rd.txt"));
		String[] detail = new String[10];

		System.out.println(" Enter 10 line ");
		for (int count = 0; count < 10; count++) {
			detail[count] = scan.nextLine();
			bw.write(detail[count]);
		}
		System.out.println(detail[2]);
		System.out.println(detail[3]);
		bw.close();

		int j = 0;
		BufferedReader br = new BufferedReader(new FileReader("F:/BIS_BIGDATA/File_handle/Showdetails4th3rd.txt"));

		if ((j = br.read()) != -1) {
			System.out.println((char) j);
		}
		br.close();
		scan.close();
	}

}
