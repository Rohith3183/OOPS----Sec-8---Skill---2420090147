package Codes;
import java.util.*;
public class Big_Small 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		int[] a = new int[n];
		int i,max=0,min=1000;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("max = " + max);
		System.out.println("min = "+ min);
		
	}
}	
