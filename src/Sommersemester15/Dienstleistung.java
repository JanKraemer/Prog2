package Sommersemester15;

public class Dienstleistung implements IVerrechenbar {

	
	private String kundenname;
	private int stundenanzahl;
	private double stundensatz;
	
	public Dienstleistung(String kundenname, int stundenanzahl, double stundensatz){
		this.kundenname = kundenname;
		this.stundenanzahl = stundenanzahl;
		this.stundensatz = stundensatz;
	}
	
	@Override
	public double schreibeRechnung() {
		double betrag = this.stundensatz*this.stundensatz;
		System.out.println(this.kundenname + " , "+this.stundenanzahl+" , " + 
		this.stundensatz + " , " + betrag );
		return betrag;
	}

}
