class MethodOverloading3 
{
	void show(int a,double b){
		System.out.println(a+" "+b);
	}
	void show(double a,int b){
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) 
	{
		MethodOverloading3 m1=new MethodOverloading3();
		m1.show(5,2.5);
		m1.show(3.6,6);
	}
}
