package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 15;
		boolean prime = true;
		
		for(int i=2; i<n; i++)
		{
			if (n%i == 0)
			{
			prime = false;
			break ;
			}
				
		}
		if(prime)
         System.out.println("prime");
		
		else
		System.out.println("not a prime");
	}

}
