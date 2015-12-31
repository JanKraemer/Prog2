package Sommersemester15;

public class Ware implements IVerrechenbar {

	private String kundenname;
	private int stueckzahl;
	private double stueckpreis;
	
	public Ware(String kundenname, int stueckzahl, double stueckpreis){
		this.kundenname = kundenname;
		this.stueckzahl = stueckzahl;
		this.stueckpreis = stueckpreis;
	}
	@Override
	public double schreibeRechnung() {
		double betrag = this.stueckpreis* this.stueckzahl;
		System.out.println(this.kundenname + " , " + this.stueckzahl + " , " + 
		 this.stueckpreis +  " , " + betrag);
		return betrag;
	}

}
