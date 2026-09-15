class MethodOverloading2 
{
	int display(int n){
		return n;
	}
	String display(String s){
		return "AKSHAYA SHRAVAN";
	}
	public static void main(String[] args) 
	{
		MethodOverloading2 m1=new MethodOverloading2();
		int r1=m1.display(191);
		System.out.println(r1);
		System.out.println(m1.display("AKSHAYA SHRAVAN"));
	}
}
