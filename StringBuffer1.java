import java.util.*;
class StringBuffer1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.append("SHRAVAN"));
		System.out.println(sb.insert(4,"Swamy"));
		System.out.println(sb.deleteCharAt(3));
		System.out.println(sb.capacity());
	}
}
