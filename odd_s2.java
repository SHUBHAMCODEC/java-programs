import java.util.Scanner;
class odd_s
{
	public static void main(String[] args)
	{
		int i,sum=0;
		System.out.print("sum of those number who is divisible by 6 or 7 :- ");
		for(i=101;i<200;i++)
		{
			if(i%6==0 || i%7==0)
			{
				sum=sum+i;
			}
		}
		System.out.print(sum);	

	}

}