
import java.util.*;
class Diagonaldiff 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the total number of rows");
		int n=scn.nextInt();
		int x=0;
		int y=0;
//entering values for arrays 		
		int ar [][] = new int [n][n];
		System.out.println("Enter the values");

		for (int i=0;i<ar.length;i++)
		{
		 for (int j=0;j<ar[i].length;j++ )
			{
			  ar[i][j]=scn.nextInt();
			}
		}
// Arranging matrix row wise
		for (int i=0;i<ar.length;i++ )
		{
			for (int j=0;j<ar[i].length;j++ )
			{
				System.out.print(ar[i][j]);
			}	
		System.out.println();
		}

//calculation part
		for (int i=0;i<n;i++ )
		{
			x+=ar[i][i];
			y+=ar[(n-1)-i][i];
		}
			int z=x-y;
			if (z<0)
			{
				z*=-1;
			}
			System.out.println("Absolute value is "+"|"+x+"-"+y+"|"+" "+"="+" "+z);
	}
}
			
		/*for (int i=0;i<ar.length;i++ )
		{
			for (int j=0;j<ar[i].length;j++ )
			{
				if (i==j)
				{
					k+=ar[i][j];
				}
			}	
		}
		System.out.println(k);*/

