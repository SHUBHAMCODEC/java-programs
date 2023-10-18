import java.util.Scanner;
class Palindrome1

{  
 	public static void main(String[] args)
	{  	
  		int r,sum=0,temp;
		Scanner i=new Scanner(System.in);
		System.out.print("enter the number: ");    
  		int n=i.nextInt();
  
  		temp=n;    
  		while(n>0)
		{    
   			r=n%10;  //getting remainder  
   			sum=(sum*10)+r;    
   			n=n/10;    
  		}    
  		if(temp==sum)    
		{
   			System.out.println("palindrome number "); 
		}   
 		else  
		{  
   			System.out.println("not palindrome");
		}    
}  
}  