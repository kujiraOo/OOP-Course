package assignment1;

public class problem3 {

	public static void main(String[] args) {
		
		for (int i = 2; i <= 10000; i++)
			if (isPrime(i)) System.out.print(i + " ");
	}
	
	static boolean isPrime(int num)
	{
		// check in range from 2 to square root of the number
		for (int i = 2; i <= Math.sqrt(num); i++)  
		{
			// if there are any divisors in that range
			// then the number is not prime
			if (num % i == 0)
				return false;
		}
		
		return true;
	}

}
