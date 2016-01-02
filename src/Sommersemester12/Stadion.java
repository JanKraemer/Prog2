package Sommersemester12;

public class Stadion {
	
	private String name;
	private int plaetze;
	
	public Stadion(){	
	}
	public Stadion(String name, int plaetze){
		this.name = name;
		this.plaetze = plaetze;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPlaetze() {
		return plaetze;
	}
	public void setPlaetze(int plaetze) {
		this.plaetze = plaetze;
	}
	public String toString(){
		return this.name + " mit soviel Plätzen: "+this.plaetze;
	}

}
