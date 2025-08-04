package Codes;
import java.util.*;
public class Sum_Avg_Array 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = sc.nextInt();
		int[] arr = new int[a];
		int i,sum=0;
		double avg;
		System.out.println("Enter the elements :");
		for(i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		avg = sum/a;
		System.out.println("sum =" + sum);
		System.out.println("avg =" + avg);
	}
}
