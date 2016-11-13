package Java_HW;


	import java.io.BufferedReader;
	import java.io.InputStreamReader;

	public class Exception_finally {
		public static void main(String [] args) throws Exception
		{	
		 int age;
		 BufferedReader br=null;
		 try
		 {
		 InputStreamReader io=new InputStreamReader(System.in);
	     br=new BufferedReader(io);
	     System.out.println("enter your age ");
	     age=Integer.parseInt(br.readLine());
	     System.out.println("hello"+age);
	     
		 }
		 catch(Exception e)
		 {
			 System.out.println("Enter numeric type data");
		 }
		 finally
		 {
			 br.close();
		 }
		 
		}

}
