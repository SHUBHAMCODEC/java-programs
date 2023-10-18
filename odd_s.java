import java.util.Scanner;
class odd_s1
{
	public static void main(String[] args)
	{
		int i,sum=0;
		System.out.print("sum of those number who is divisible by 5 or 7 :- ");
		for(i=1;i<100;i++)
		{
			if(i%5==0 || i%7==0)
			{
				sum=sum+i;
			}
		}
		System.out.print(sum);	

	}

}