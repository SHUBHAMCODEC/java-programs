import java.util.Scanner;
class sum
{

	public static void main(String[] args)
	{
		int n,sum=0,temp;
		Scanner var=new Scanner(System.in);
		System.out.println("Enter the number");
		n=var.nextInt();
		
		while(n>0)
		{
			temp=n%10;
			sum=sum+temp;
			n=n/10;
		}
		System.out.println("sum of given number is "+sum);

		
	}
}