package assignment6.journey;

public class JourneyMain {

	public static void main(String[] args) {

		Journey[] journeys = { new Journey(10, 50, 1000),
				new Journey(8, 30, 100), new Journey(13, 100, 600),
				new Journey(11, 70, 300), new Journey(7, 20, 15), };
		
		for (int i = 0; i < journeys.length; i++)
			System.out.println(journeys[i] + "\n");

	}

}
