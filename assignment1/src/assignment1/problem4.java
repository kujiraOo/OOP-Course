package assignment1;

public class problem4 {
	
	public static void main(String[] args)
	{
		// print series 
		// a = a1 = -1, a2 = 2, a3 = 5, a[n] = a[n-3] + a[n-2] + a[n-1] / 2
		// the length of the array determines the length of the series
		double[] a = new double[10];
		
		// initial values
		a[1] = -1;
		a[2] = 2;
		a[3] = 5;
		
		int n = 4;
		
		// print out initial values
		System.out.print(a[1] + " " + a[2] + " " + a[3] + " ");
		
		for (; n < a.length; n++)
		{
			a[n] = (a[n-3] + a[n-2] + a[n-1] / 2); // calculate new values using formula
			
			System.out.print(a[n] + " ");
		}
	}
}
