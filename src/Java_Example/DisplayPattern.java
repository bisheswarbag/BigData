package Java_Example;
import java.util.Scanner;
public class DisplayPattern {
	
	
	public static void main(String args[])
	{
		
		Scanner sobj = new Scanner(System.in);
		int rows = sobj.nextInt();
		int rowcount = rows;
		//Print All the Spaces
		for(int i = 0; i<5;i++)
			for(int j=0;j<i;j++)
			{
				System.out.println('A'+j);
		    }
	}

}
