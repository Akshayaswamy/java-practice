import java.util.*;
class Demo 
{
	public void add(int n1,int n2){
	int r=n1+n2;
	System.out.println("Sum is : "+r);
	}
	public String get(){
		return "pen";
	}
	public static void main(String[] args) 
	{
		int n1=5;
		int n2=6;
		Demo d=new Demo();
		d.add(n1,n2);
		System.out.println(d.get());
	}
}
