package Java_HW;
import java.util.Scanner;

public class Strings_compare {
	public static void main(String []args)
	{   
		Scanner s=new Scanner(System.in);
		String []name= new String[20];
		int size_of_string;
		System.out.print("Enter the no. of string you want to compare "); 
		size_of_string = s.nextInt();
		System.out.println(" Enter the strings to be compared are " );
		for(int i=0;i<size_of_string;i++)
		{
			name[i]=s.next();
		}
		for (int i =0;i<size_of_string;i++)
		{
			System.out.println(name[i]);
		}
		for(int i=0; i< size_of_string;i++)
		{
			for(int j=i+1;j<size_of_string;j++)
			{
				if (name[i].compareTo(name[j])>0)
				{
					String temp;
					temp=name[i];
					name[i]=name[j];
					name[j]=temp;
					
				}
			}
		}
		for(int i=0;i<size_of_string;i++)
		{    
			System.out.println();
			System.out.print(name[i]);
		}
	}

}
