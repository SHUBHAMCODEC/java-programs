class prime_s1 
{

	public static void main(String[] args) 
	{
		int i, number, count, sum = 0 ;
			
		for(number = 20; number <30; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	sum = sum + number;
		    }  
		}
                System.out.print("\n The Sum of Prime Numbers from 20 to 30 = " + sum);
	}
}