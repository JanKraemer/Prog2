package Wintersemester1011;

public class Artikelverwaltung {

	public static void main(String[] args) {
		Zaehlbar[] konten = { 
				new Getraenk("Cola",1235324,10),
				new Getraenk("Fanta", 123423,20),
				new Getraenk("Sprite",18923432,30),
				null,
				new Kuehlware("Erbsen",13231,40),
				new Kuehlware("Möhren", 5452,50)
		};
			
		int anzahl = 0;
		for (Zaehlbar c:konten)
			if(c != null)
				anzahl+=c.getAnzahl();
		System.out.println(anzahl);
		}
	}

