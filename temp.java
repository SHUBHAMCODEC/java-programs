import java.util.Scanner;
class temp1{

	public static void main(String[] args)
	{
		double i,f,k;

		Scanner n=new Scanner(System.in);
		System.out.print("Enter temp in celcius: ");
		i=n.nextDouble();
		f=i*(9/5)+32;
		k=i+273.15;
		System.out.print("temp in fahrenheit: "+ f+"\n");
		System.out.print("temp in Kelvin: "+k);

	}
}