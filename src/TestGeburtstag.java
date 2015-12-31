public class TestGeburtstag {

	static GeburtstagsVerwalt verwaltung = new GeburtstagsVerwalt();
	static Geburtstag max = new Geburtstag("Max Klemm",6,3,1990);
	static Geburtstag jan = new Geburtstag("Jan Krämer",28,6,1987);
	static Geburtstag phil = new Geburtstag("Phil",6,3,1989);
	static Geburtstag bernd = new Geburtstag("Bernd",6,3,1998);
	static Geburtstag bob = new Geburtstag("bob",27,7,1987);
	
	public static void main(String[] args) {
		System.out.println("Test startet:");
		testAddGeburtstag();
		testGetMethode();
		testAllNames();
		testSortMeth();
		System.out.println("TESTENDE");
	}
	private static void testAddGeburtstag(){
		verwaltung.addGeburtstag(max);
		verwaltung.addGeburtstag(new Geburtstag("Max Klemm",4,5,1992));
		if(verwaltung.alleGeburtstage().length != 1 && verwaltung.getGeburtstag("Max Klemm").getMonat() != 3)
			System.out.println("Fehler in der addGeburtstags Methode");
	}
	private static void testGetMethode(){
		verwaltung.addGeburtstag(jan);
		verwaltung.addGeburtstag(phil);
		verwaltung.addGeburtstag(bernd);
		if(null != verwaltung.getGeburtstag("heinz"))
			System.out.println("Return Value in der GetMethode falsch");
		if(!verwaltung.getGeburtstag("Phil").equals(phil))
			System.out.println("Get Methode falsch!");
	}
	private static void testAllNames(){
		if(verwaltung.alleNamenAmGleichenTag(max).length != 3)
			System.out.println("Methode Gleicher Tag ist falsch");
	}
	private static void testSortMeth(){
		verwaltung.addGeburtstag(bob);
		Geburtstag[] tage = new Geburtstag[]{jan,bob,phil,max,bernd};
		Geburtstag[] ref = verwaltung.alleGeburtstageNachDatum();
		for(int i = 0;i< tage.length;i++)
			if(!tage[i].equals(ref[i]))
				System.out.println("Sortiermethode falsch");
	}
}
