import java.util.*;
class Selectionsort 
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
		int min=-1;
		for(int i=0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[min]>a[j])
					min=j;
		    }
			temp=a[min];
			a[min]=a[i];
			a[i]=temp;
	    }
		System.out.println();
		System.out.print("After sorting:");
		for(int num:a)
		{
			System.out.print(num+" ");
		}
}
}
