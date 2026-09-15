import java.util.*;
class MethodOverloading 
{
	public int add(int n1,int n2){
		int result=n1+n2;
		return result;
	}
	public int add(int n1,int n2,int n3){
		int res=n1+n2+n3;
		return res;
	}
	public static void main(String[] args) 
	{
		MethodOverloading m=new MethodOverloading();
		int r1=m.add(2,3);
		int r2=m.add(5,7,9);
		System.out.println(r1);
		System.out.println(r2);
	}
}
