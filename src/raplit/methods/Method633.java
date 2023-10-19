package raplit.methods;

public class Method633 {
	public static void main(String[] args) {
		
		Player playerObj = new Player();
		playerObj.setPlayerName("Tom");
		playerObj.setPlayerAge("30");
		playerObj.setGameType("Soccer");
		
		System.out.println("Player name is "+ playerObj.getPlayerName());
		System.out.println("Player age is " + playerObj.getPlayerAge());
		System.out.println("game type is " + playerObj.getGameType());

	}	

}

class Player{
	
	private String playerName;
	private String PlayerAge;
	private String gameType;
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public String getPlayerAge() {
		return PlayerAge;
	}
	
	public void setPlayerAge(String playerAge) {
		PlayerAge = playerAge;
	}
	
	public String getGameType() {
		return gameType;
	}
	
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	
	
	
	
}
