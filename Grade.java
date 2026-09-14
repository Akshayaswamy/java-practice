import java.util.*;
class Grade 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==100)
		System.out.println("O Grade");
		else if(n>=80 && n<100)
		System.out.println("A+ Grade");
		else if(n>=60 && n<80)
		System.out.println("A Grade");
		else if(n>=45 && n<60)
		System.out.println("B Grade");
		else
			System.out.println("Fail");
	}
}
