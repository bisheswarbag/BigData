//check if the strings are equal or not by using [equals and equal ignore methods]?
package Java_HW;
public class String_equal {
	
	public static void main(String []args)
	{
		String string1= "Bisheswar";
		String string2= "bisheswar";
		boolean x = string1.equals(string2);
		System.out.println(x);	
		boolean y= string1.equalsIgnoreCase(string2);
		System.out.println(y);
	}

}
