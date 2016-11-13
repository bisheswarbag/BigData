//use super by ursef bcs else compiler will use its and dont gib=ve any arument to it

package Java_Example;
public class SuperConstructor 
{
          
          
        SuperConstructor (int x)
          {   
        	  int a=0;
        	  a=x;
        	  
        	System.out.println("Parent class constructor");  
			
		  }
}
          class Bap extends SuperConstructor
          {
          Bap()
          {  
        	  super(10);
        	  int b=0;
        	  System.out.println(" child class constructor");
        	 
          }
          
          
          public static void main(String []args)
          { 
        	  Bap obj=new Bap();
        	  
        	  
          
          }
}
        	  
        


