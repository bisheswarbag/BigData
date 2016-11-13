
	package Java_HW;
	import java.io.*;
	import java.util.*;

	public class FileHandingWriteEndOfFile {
		public static void main(String[] args) throws Exception {
			Scanner scan = new Scanner(System.in);
			String name = "";
			int C_id;
			int age = 0;
			// FileReader fr=null;
			// BufferedReader br=null;
			// fr=new FileReader(fn);
			// br=new BufferedReader(fr); 
			// String fn="F:/BIS_BIGDATA/File_handle/coustomer1.text";
			FileWriter fw = null;
			BufferedWriter bw = null;

			//File f1 = new File("F:/BIS_BIGDATA/File_handle/WriteEndOfFile.txt");
			
			//if (f1.exists()) {
				//f1.delete();
			//} else
				//f1.createNewFile();

			
			bw = new BufferedWriter(new FileWriter("F:/BIS_BIGDATA/File_handle/WriteEndOfFile.txt",true));
			try {
				System.out.println(" Enter your name ");
				name = scan.nextLine();
				bw.write(name);
				try {
					System.out.println("Enter your age ");
					age = scan.nextInt();
					bw.write(String.valueOf(age));
					System.out.println(" Enter your c_id ");
					C_id = scan.nextInt();
					bw.write(String.valueOf(C_id));
					System.out.println(name);
					System.out.println(age);
				    }
				catch (Exception e1) {
					System.out.println(" enter integer only ");
				}

			} catch (Exception ex) {
				System.out.print("enter string only ");

			} finally {
				bw.close();
				scan.close();
			}

			/*
			 * Sy
			 * 
			 * System.out.println(" Enter your costmer id "); C_id=br.readLine();
			 * bw.write(C_id); System.out.println(" Enter your age");
			 * age=Integer.parseInt(br.readLine()); bw.write(String.valueOf(age));
			 * 
			 * System.out.println(" Enter the total money you spent on products ");
			 * MoneySpent=br.readLine(); bw.write(MoneySpent);
			 * 
			 * 
			 * bw.close(); }
			 * 
			 * catch(Exception e) { System.out.println("Error writing to file"
			 * +fn+"'"); } }
			 * 
			 * 
			 * 
			 * 
			 * FileReader fr=new
			 * FileReader("F:/BIS_BIGDATA/File_handle/coustomer.txt",true);
			 * BufferedWriter br=new BufferedWriter(fr);
			 * System.out.println(br.readLine())
			 */

		}

	}


