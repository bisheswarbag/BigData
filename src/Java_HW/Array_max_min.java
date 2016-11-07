package Java_HW;
import java.util.Scanner;
public class Array_max_min {
	public static void main(String []args)
	{
		Scanner Enum = new Scanner(System.in);
		System.out.println("Enter the 5 numbers: ");
		int [] num = new int[5];
		for(int i=0;i<5;i++)
		{
		num[i] = Enum.nextInt();
		}
		int max=num[0];
		int min=num[0];
		for(int i=0;i<num.length;i++)
		{
			if( num[i]>max)
			{
				max=num[i];
			}
			else if(num[i]<min)
			{
				min=num[i];
			
			}
		}
		System.out.println("The max the number" +max);
		System.out.println("The min the number" +min);
		

}

}
