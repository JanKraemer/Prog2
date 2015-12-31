package Sommersemester13;

public class TestMenge {
	
	static Menge first = new Menge();
	static Menge second;

	public static void main(String[] args) {
		System.out.println("Test start:");
		testAddMethode();
		testPublicConstructor();
		testSchnittmenge();
		testVereinigung();
		System.out.println("TestEnde");
	}
	public static void testAddMethode(){
		Object c = new Integer(2);
		first.hinzufuegen(c);
		if(first.hinzufuegen(c))
			System.out.println("Add Methode Fehlerhaft!");
	}
	public static void testPublicConstructor(){
		Object[] in = {new Integer(2),new Integer(5),new Integer(2)};
		second = new Menge(in);
		if(2 != second.data.size())
			System.out.println("Spezieller Konstruktor fehlerhaft!");
	}
	public static void testSchnittmenge(){
		first.hinzufuegen(new Integer(3));
		first.hinzufuegen(new Integer(4));
		Menge third = first.schnittmenge(second);
		if(1!= third.data.size())
			System.out.println("Schnittmenge funktioniert nicht!");
	}
	public static void testVereinigung(){
		Menge third = first.vereinigung(second);
		if(4!= third.data.size())
			System.out.println("Vereinigung funktioniert nicht!");
	}

}
