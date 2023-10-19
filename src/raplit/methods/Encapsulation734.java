package raplit.methods;

public class Encapsulation734 {
	public static void main(String[] args) {
		Player1 playerObj = new Player1("Kevin", 30, "Football");
		
		System.out.println("Player's Name: " + playerObj.getPlayerName());
		System.out.println("Player's Age: " + playerObj.getPlayerAge());
		System.out.println("Player's Game type: " + playerObj.getGameType());
		
	}

}

class Player1{
	private String playerName;
	private int playerAge;
	private String gameType;

	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public int getPlayerAge() {
		return playerAge;
	}
	
	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}
	
	public String getGameType() {
		return gameType;
	}
	
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public Player1(String playerName, int playerAge, String gameType) {
		this.playerName = playerName;
		this.playerAge = playerAge;
		this.gameType = gameType;
	}
	
	
}
