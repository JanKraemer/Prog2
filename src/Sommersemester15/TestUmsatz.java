package Sommersemester15;

public class TestUmsatz {

	public static void main(String[] args){
		Umsatz umsatz = new Umsatz();
		Ware cola = new Ware("Cola",100 , 0.79);
		Dienstleistung it = new Dienstleistung("IT", 20, 45.20);
		umsatz.erhoeheUmsatz(cola);
		umsatz.erhoeheUmsatz(it);
	}
}
