package Sommersemester11;

public class Fahrzeug {

	protected float preis;
	protected String herstellerName;
	
	public Fahrzeug(String herstellerName, float preis){
		this.herstellerName = herstellerName;
		this.preis = preis;
	}
	public String toString(){
		return "Hersteller: " + herstellerName + " ,Preis: " + preis;
	}
	public float getPreis(){
		return this.preis;
	}
}
