class Student 
{
	private int age;
	private String name;
	public Student()
	{
		age=22;
		name="SHRAVAN NEELA";
	}
	public Student(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	public void display()
	{
		System.out.println("Age : "+age);
		System.out.println("Name : "+name);
	}
}
public class Constructor1
{
	public static void main(String[] args) 
	{
		Student s=new Student();
		Student s1=new Student(19,"AKSHAYA");
		s.display();
		s1.display();
	}
}
