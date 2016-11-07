package Java_HW;

public class pattren_rev_tri 
{
	public static void main(String [] args)
	{
		for (int i=1;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=6;k>(i*2)-1;k--)
			{
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
