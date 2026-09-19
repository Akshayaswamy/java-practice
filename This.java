class Student
{
	private int marks;
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getMarks(){
		return marks;
	}
	public void setMarks(int marks){
		this.marks=marks;
	}
}
public class This
{
	public static void main(String args[]){
		Student s=new Student();
		s.setName("AJAY");
		s.setMarks(95);
		System.out.println(s.getName() +" : "+s.getMarks());
}
}