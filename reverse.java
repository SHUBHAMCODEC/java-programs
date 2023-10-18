import java.util.Scanner;
class reverse2
{
	public static void main(String[] args)
	{
		int n,temp,r=0;
		Scanner v=new Scanner(System.in);
		System.out.print("Enter ur number: ");
		n=v.nextInt();
		System.out.print("Initial  number: "+n+"\n");
		while(n>0)
		{
			temp=n%10;
			r=(r*10) + temp;
			n=n/10;
		}
		System.out.println("Reverse  number: "+r);


	}

}