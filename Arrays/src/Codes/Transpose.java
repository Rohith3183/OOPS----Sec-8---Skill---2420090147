package Codes;
import java.util.*;
public class Transpose 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a= new int[n][n];
		
		int i,j;
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println("");
		}
		
		
		sc.close();
	}
}
