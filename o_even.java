import java.util.Scanner;
public class o_even{

	public static void main(String[] args){

	Scanner var=new Scanner(System.in);
	System.out.print("Enter your number : ");
	int num=var.nextInt();
	if(num%2==0){

		System.out.println(num + " is a even number");
	}
	else{
		System.out.println(num + " is a odd number");
	}
		
}
}