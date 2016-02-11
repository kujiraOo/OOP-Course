package assignment1;

public class problem2 {
	
	public static void main(String[] args)
	{
		series1();
		series2();
		series3();
	}
	
	// 1 1 2 3 5 8 13 21 ...
	// each number is sum the sum of two previous ones 
	static void series1()
	{
		int a = 0, b = 1, temp = 0;
		
		for (int i = 0; i < 10; i++)
		{
			System.out.print(b + " ");
			temp = b; // save current value of b
			b = a + b; // update b
			a = temp; // a will hold the previous value of b
		}
		
		System.out.println();
	}
	
	// 1 1 2 4 7 13 24 44 ...
	static void series2()
	{
		int a = 0, b = 0, c = 1, temp1 = 0, temp2 = 0;
		
		for (int i = 0; i < 10; i++)
		{
			System.out.print(c + " ");
			
			temp1 = c; // save current value of c
			c = a + b + c; // update c
			
			temp2 = b; // save current value of b
			b = temp1; // b will hold the previous value of c
			
			a = temp2; // a will hold the previous value of b
		}
		
		System.out.println();
	}
	
	// 1 3 4 6 14 9 37 12 ...
	// the series starts with 1
	// each second number of the series is multiplier of 3
	// all other numbers are the sums of all previous numbers in
	// the series
	static void series3()
	{
		int a = 1, b = 3, sum = 0; // hold sum of all values previous values
		
		for (int i = 1; i <= 10; i++)
		{
			if (i % 2 == 1) // check if odd
			{
				System.out.print(a + " ");
				sum += a;
			}
			else
			{
				System.out.print(b + " ");
				sum += b;
				b += 3;
			}
			
			a = sum;
		}
	}
}
