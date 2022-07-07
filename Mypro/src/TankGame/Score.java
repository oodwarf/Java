package TankGame;

public class Score {

	private String player;
	private int score;
	
	
	public Score() {
		super();
	}


	public Score(String player, int score) {
		super();
		this.player = player;
		this.score = score;
	}


	public String getPlayer() {
		return player;
	}


	public void setPlayer(String player) {
		this.player = player;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public void addScore(){
		this.score=this.score+100;
	}

}
