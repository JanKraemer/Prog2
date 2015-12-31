package Sommersemester15;

public class Umsatz {

	private double kumulierterUmsatz;
	
	void erhoeheUmsatz(IVerrechenbar a){
		this.kumulierterUmsatz += a.schreibeRechnung();
		System.out.println(kumulierterUmsatz);
	}
}
