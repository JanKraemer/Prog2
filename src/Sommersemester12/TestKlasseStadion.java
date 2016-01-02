package Sommersemester12;

public class TestKlasseStadion {

	public static void main(String[] args) {

		Meisterschaft bundesliga = new Meisterschaft();
		try{
		bundesliga.stadionEinfuegen(new Stadion("a",120));
		bundesliga.stadionEinfuegen(new Stadion("a",120));
		}catch (Exception e)
		{
			e.getMessage();
		}
		Stadion[] cur = bundesliga.getAlleStadienSortiert();
		for(Stadion c: cur)
			System.out.println(c);
	}

}
