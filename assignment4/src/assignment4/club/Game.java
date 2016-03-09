package assignment4.club;

public class Game {

	private String description, date, time, player1, player2, result;
	private static int gameCounter = 0;

	
	private static void updateGameCounter(){
		gameCounter++;
		System.out.println("gameCounter: " + gameCounter);
	}

	// default constructor
	public Game() {
		this.description = "No description";
		this.date = "dd/mm/yyyy";
		this.time = "hh:mm";
		this.player1 = "Uknown1";
		this.player2 = "Uknown2";
		this.result = "No result";

		updateGameCounter();
	}

	// main constructor
	public Game(String description, String date, String time, String player1,
			String player2, String result) {
		this.description = description;
		this.date = date;
		this.time = time;
		this.player1 = player1;
		this.player2 = player2;
		this.result = result;

		updateGameCounter();
	}

	// clone constructor
	public Game(Game g) {
		this.description = g.description;
		this.date = g.date;
		this.time = g.time;
		this.player1 = g.player1;
		this.player2 = g.player2;
		this.result = g.result;

		updateGameCounter();
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public void setPlayer2(String player2) {
		this.player2 = player2;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String toString() {
		return description + "\ndate: " + date + "\ntime: " + time
				+ "\nplayer 1: " + player1 + "\nplayer 2: " + player2
				+ "\nresult: " + result;
	}

	// takes string as an argument and compares it to player1, player2, date
	// attributes
	public boolean find(String request) {
		return request.equals(player1) || request.equals(player2)
				|| request.equals(date);
	}

}
