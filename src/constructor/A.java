package constructor;

public class A {
	public A()
	{
		System.out.println(" g");
	}
class B extends A
{
	public B()
	{
		System.out.println("fd");
	}
}
public static void main(String [] args)
{
	B obj=new B();
}
}
