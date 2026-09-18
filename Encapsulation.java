class Encapsulation1 
{
	private String name;
	private int age;
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
	name=n;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int a)
	{
	age=a;//wrapping variables and methods into single unit(private variables,public methods)
	}
}
	public class Encapsulation
	{
	public static void main(String[] args) 
	{
		Encapsulation1 e=new Encapsulation1();
		e.setName("SHRAVAN");
		e.setAge(22);
		System.out.println(e.getName());
		System.out.println(e.getAge());
		
	}
}
