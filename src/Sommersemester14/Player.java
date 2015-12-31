package Sommersemester14;

public class Player {
	
	private String name;
	private int numGoals = 0;
	
	public Player(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void score(){
		numGoals++;
	}
	public int getGoals(){
		return this.numGoals;
	}
	public String toString(){
		return "Der Spieler " + this.name+ " hat "+this.numGoals + " Tore geschossen.";
	}
}