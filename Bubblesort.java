import java.util.*;
class Bubblesort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		System.out.print("Before sorting:");
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
		int temp=0;
		for(int j=0;j<a.length;j++)
		{
			for(int k=0;k<a.length-j-1;k++)
		   {
				if(a[k]>a[k+1])
				{
					temp=a[k];
					a[k]=a[k+1];
					a[k+1]=temp;
				}
		   }
	    }
		System.out.println();
		System.out.print("After sorting:");
		for(int num:a)
		{
			System.out.print(num+" ");
		}
}
}
