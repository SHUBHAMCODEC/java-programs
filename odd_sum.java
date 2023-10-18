import java.util.Scanner;
class odd_sum
{
	public static void main(String[] args)
	{
		int i,sum=0;
		System.out.print("sum of odd number lying between 10 to 50:- ");
		for(i=10;i<50;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.print(sum);	

	}

}