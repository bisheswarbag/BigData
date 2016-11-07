package Java_HW;

public class Student_parameter_constructor {
	int x;
	int y;
	Student_parameter_constructor(int length,int breadth)
	{   
		System.out.println("Parameterised constructor called");
		 x=length;
		 y=breadth;
	}
	void area()
	{
		int c;
		c= x*y;
        System.out.print("the area of rectangle is "+c);
    }
	public static void main(String []args)
	{
		Student_parameter_constructor p1 = new Student_parameter_constructor(2,3);
		Student_parameter_constructor p2 = new Student_parameter_constructor(5,5);
		p1.area();
	}
}
