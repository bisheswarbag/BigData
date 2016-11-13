// Replace a character of the Input String

package Java_HW;
import java .util.*;
public class String_replce {
	public static void main(String [] args)
	{   
		Scanner s1=new Scanner(System.in);
		String str1,str2;
		char character1,character2;
		System.out.println(" Enter a String to be replace ");
		str1=s1.nextLine();
		System.out.println("Enter the character to be replace ");
		character1=s1.next().charAt(0);
		System.out.println("Enter the word to be replaced with ");
		character2=s1.next().charAt(0);
		
		char char1=str1.charAt(4);  // used char for storing character
		System.out.println(char1);
		str2=str1.replace(character1,character2);   //str1=setCharAt(4,'y');
		System.out.println("string after replacement " +str2);
	}   

}
