class Calc
{
	public int add(int n1,int n2)
	{
		return n1+n2;
	}
	public int sub(int n1,int n2)
	{
		return n1-n2;
	}
}
class AdvClass extends Calc
{
  public int mul(int n1,int n2)
	{
		return n1*n2;
	}
	public int div(int n1,int n2)
	{
		return n1/n2;
	}	
}
public class  SingleInheritance
{
	public static void main(String[] args) 
	{
		AdvClass obj=new AdvClass();
		int r1=obj.add(6,7);
		int r2=obj.sub(9,7);
		int r3=obj.mul(6,3);
		int r4=obj.div(12,4);
		System.out.println(r1+" "+r2+" "+r3+" "+r4);
	}
}
