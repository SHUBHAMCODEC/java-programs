import java.util.Scanner;
class swap1
{
	public static void main(String[] args)
	{	
		int x,y,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number :");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("before swapping: "+x+" and "+y);
		sum=x+y;
		y=sum-y;
		x=sum-x;	
		System.out.println(" after swapping: "+x+" and "+y);

	} 	



}