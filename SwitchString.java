import java.util.*;
class  SwitchString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		switch(x) {
			case "Monday","Tuesday":
		System.out.println("6am");
			break;
			case "sunday":
		System.out.println("10am");
			break;
			default:
				System.out.println("7am");
		}
	}
}
