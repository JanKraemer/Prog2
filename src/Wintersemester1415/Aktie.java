package Wintersemester1415;

public class Aktie {

	private String name;
	private double kurs;
	private int anzahl;
	
	public Aktie(){
		this("Telekom AG",14.50,1000);
	}
	public Aktie(String name, double kurs, int anzahl){
		this.name = name;
		this.kurs = kurs;
		this.anzahl = anzahl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getKurs() {
		return kurs;
	}
	public void setKurs(double kurs) {
		this.kurs = kurs;
	}
	public int getAnzahl() {
		return anzahl;
	}
	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
	public String toString(){
		return this.anzahl+ " von der Aktie "+ this.name + " mit einem Kurs von " +this.kurs;
	}
	public double wert(){
		return this.kurs*this.anzahl;
	}
	
}
