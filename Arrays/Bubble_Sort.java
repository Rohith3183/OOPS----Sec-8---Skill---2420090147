package Arrays;
import java.util.*;
public class Bubble_Sort 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n= sc.nextInt();
		int[] a= new int[n];
		int i,j,temp;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i] +" ");
		}
    }
}
