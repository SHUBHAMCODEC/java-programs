import java.util.Scanner;
class leap{
	public static void main(String[] args)
	{
		Scanner var=new Scanner(System.in);
		System.out.print("Enter your year : ");
		int num=var.nextInt();
		if(num%4==0)
		{
			System.out.print(num + " is a leap year.. ");
		}
		else
		{
			System.out.print(num + " is not a leap year.. ");	

		}
	
	}
}