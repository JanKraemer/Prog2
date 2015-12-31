package Sommersemester14;

public class TestTeam {

	static Team bayern = new Team();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bayern.addPlayerToTeam("bob");
		bayern.addPlayerToTeam("pizarro");
		bayern.addPlayerToTeam("heinz");
		try{
			bayern.substitutePlayer("hein", "lukas");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		for(Player c:bayern.getPlayers())
			System.out.println(c);
	}

}
