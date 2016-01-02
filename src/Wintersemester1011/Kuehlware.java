package Wintersemester1011;

public class Kuehlware implements Zaehlbar{

	private String name;
	private int kuehltemperatur;
	private int anzahl;
	
	public Kuehlware(String name, int kuehltemperatur, int anzahl){
		this.name = name;
		this.kuehltemperatur = kuehltemperatur;
		this.anzahl = anzahl;
	}

	@Override
	public int getAnzahl() {
		// TODO Auto-generated method stub
		return anzahl;
	}
}
