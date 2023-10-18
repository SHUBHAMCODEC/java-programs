import java.util.Scanner;
class pairs1
{
	public static void main(String[] args)
	{
		int i,j;
		System.out.println("all pairs lying between 1 to 25 whose sum is 30:");
		for(i=1;i<=25;i++)
		{
			for(j=25;j>=1;j--)			
			{
				if(i+j==30)
				{
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}
			

	}

}