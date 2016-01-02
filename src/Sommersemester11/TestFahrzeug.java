package Sommersemester11;

public class TestFahrzeug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fahrzeug[] fahrzeuge = new Fahrzeug[6];
		fahrzeuge[0]  = new PKW("VW",15000,"Golf");
		fahrzeuge[1]  = new PKW("VW",10000,"Polo");
		fahrzeuge[2]  = new PKW("Porsche",45000,"GT");
		fahrzeuge[3]  = new Motorrad("Yamaha", 8500);
		fahrzeuge[4]  = new Motorrad("BMW",5000);
		fahrzeuge[5]  = null;
		
		for(Fahrzeug c: fahrzeuge)
			System.out.println(c);
		float summe = 0;
		for(Fahrzeug c: fahrzeuge)
			if(c != null)
				summe+= c.getPreis();
		System.out.println ("\nGesamtwert aller Fahrzeuge: " + summe);
	}

}
