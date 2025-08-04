package Codes;
import java.util.*;
public class Matrix 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a= new int[n][n];
		int[][] b= new int[n][n];
		int i,j,c;
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
				b[i][j] = sc.nextInt();
			}
		}
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				c=a[i][j]+b[i][j];
				System.out.print(c + " ");
			}
			System.out.println("");
			
		}
		
		sc.close();
	}
}
