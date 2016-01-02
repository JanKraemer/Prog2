package Wintersemester1011;

public class Getraenk implements Zaehlbar{

	private String name;
	private long artikelnummer;
	private int anzahl;
	
	public Getraenk(String name, long artikelnummer, int anzahl){
		this.name = name;
		this.artikelnummer = artikelnummer;
		this.anzahl = anzahl;
	}

	@Override
	public int getAnzahl() {
		// TODO Auto-generated method stub
		return anzahl;
	}
}
