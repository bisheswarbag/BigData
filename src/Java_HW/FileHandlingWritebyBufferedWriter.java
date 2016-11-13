//add at the end of an file

package Java_HW;

import java.io.*;


public class FileHandlingWritebyBufferedWriter {
	public static void main(String[] args) throws Exception {
		 //FileWriter fv=null;
		BufferedWriter bwr = new BufferedWriter(new FileWriter("F:/BIS_BIGDATA/newFileere.xls"));
		bwr.write(66);
		bwr.write("ISHESWAR");
		char []ch= {'a','b','c'};
		bwr.write(ch);
		//bwr.flush();
		bwr.close();

	}

}