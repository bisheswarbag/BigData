package Java_Example;
import java.util.StringTokenizer;
public class removeSpaces
{
	public static void main(String[] args)
	{
	String str = "This     is    Java";
	//System.out.println(str);
	StringTokenizer st = new StringTokenizer(str," "); 
	 //System.out.println(st.nextToken()); 
	StringBuffer sb = new StringBuffer(str);
		while (st.hasMoreElements())
		{
			sb.append(st.nextElement());
	    }
		System.out.println(sb);
	}
}





