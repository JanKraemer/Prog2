package Sommersemester15;

public class TestKonto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test startet!");
		testSparkonto();
		testHypothekenKonto();
		System.out.println("Test ist zu ENDE.");
	}
	public static void testSparkonto(){
		Sparkonto jan = new Sparkonto("Jan",25.0,0.0,13);
		if(jan.abheben(45)!= 0.0)
			System.out.println("ERROR");
		if(jan.abheben(23)!= 23.0)
			System.out.println("ERROR");
		if(jan.getSaldo() != 2.0)
		System.out.println("ERROR");
	}
	public static void testHypothekenKonto(){
		Hypothekenkonto jan = new Hypothekenkonto("Jan",-450,0.0);
		try{
			jan.sondertilgung(500);
		}catch(IllegalArgumentException e)
		{
		}
		if(jan.getSaldo() != -450.0)
			System.out.println("ERROR");
		jan.sondertilgung(400);
		if(jan.getSaldo() != -50.0)
			System.out.println("ERROR");
	}


}
