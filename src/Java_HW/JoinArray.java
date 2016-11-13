package Java_HW;

public class JoinArray {
	  public static void main(String[]args){

	  int[]a = {1, 2, 3};
	  int[]b = {4, 5, 6};
	  int[]c = new int[5];
      int k=0; 
	  for(int i=0; i<6; i++)
	  {
	   if(i>3)
	   {
		c[i]=b[k];
		k++;
	   }
	   c[i]=a[i];
	  System.out.println(c[i]);
	}
}
}