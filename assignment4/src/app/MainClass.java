package app;

import club.Game;

public class MainClass {

	public static void main(String[] args) {
		

		System.out.println("Creating array of 5 games");
		Game[] games = {
				new Game("first game", "20/06/1990", "12:55", "John", "Bob",
						"John wins"),
				new Game("second game", "11/11/2011", "11:11", "Jane", "Kate",
						"Kate wins"),
				new Game("third game", "09/05/2003", "19:00", "Zhihao",
						"Prakash", "Zhihao wins"),
				new Game("fourth game", "10/12/2001", "18:00", "Cat", "Dog",
						"Dog wins"),
				new Game("fifth game", "03/03/2003", "15:03", "Smith",
						"Victorien", "Victorien wins") };

		System.out
				.println("Looking for games in which Zhihao has participated \nor that were played on 03/03/2003. \nIn case games are found print info about them.\n");

		for (int i = 0; i < games.length; i++) {
			if (games[i].find("Zhihao") || games[i].find("03/03/2003"))
				System.out.println(games[i] + "\n");
		}

		System.out.println("Creating a game with default constructor");

		Game game = new Game();

		System.out.println(game);
		System.out.println();

		System.out.println("Testing description, date and time setters");

		game.setDescription("nice game");
		game.setDate("03/06/1970");
		game.setTime("14:00");

		System.out.println(game);
		

	}
}
