class Mobile 
{
	String brand;
	int cost;
	static String name;
	 public void show(){
		 System.out.println("brand : "+brand+", "+"cost : "+cost+", "+"name : "+name);
	 }
}
class StaticVariable
{
	public static void main(String[] args) 
	{
		Mobile obj1=new Mobile();
		obj1.brand="Apple";
		obj1.cost=100000;
		Mobile.name="SmartPhone";
		Mobile obj2=new Mobile();
		obj2.brand="Samsung";
		obj2.cost=70000;
		Mobile.name="Phone";
		obj1.show();
		obj2.show();
		
	}
}
