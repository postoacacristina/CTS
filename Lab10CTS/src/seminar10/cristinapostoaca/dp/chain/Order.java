package seminar10.cristinapostoaca.dp.chain;

public class Order {
	private String name;
	private int difficulty; //in minutes
	public Order(String name, int difficulty) {
		super();
		this.name = name;
		this.difficulty = difficulty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	

}
