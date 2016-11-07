//overriding in polymorphism

package Java_Example;
public class Poly_override {
	public static void main(String [] args)
	{
		 Multiply m=new Multiply();
		    m.disp();
		    }
}
	
	class Add
	{  
		public void disp()
		{
		System.out.println("i love my india");
		}
	}
    class Multiply extends Add
    {
    	public void disp()
		{

		System.out.println(" Overriding done ");
    	
		}
    }

    
   
      

