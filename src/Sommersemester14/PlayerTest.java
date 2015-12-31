package Sommersemester14;

import java.util.Arrays;
import java.util.Comparator;


public class PlayerTest {

	
	private static class ComparatorName implements Comparator<Player>
	{
		public int compare(Player a, Player b)
		{
			return a.getName().compareTo(b.getName());
		}
	}
	private static class ComparatorGoal implements Comparator<Player>
	{
		public int compare(Player a, Player b)
		{
			return Integer.compare(a.getGoals(), b.getGoals());
		}
	}
	public static void main(String[] args){
		
		Player[] players = new Player[]{
				new Player("Podolski"),
				new Player("Lahm"),
				new Player("Mertesacker")
			};
		for(int i = 0 ;i< players.length;i++){
			int random =(int) (Math.random()*10);
			while(random > 0){
				players[i].score();
				random--;
			}
		}
		Arrays.sort(players, new ComparatorName());
		for( Player c: players)
			System.out.println(c);
		Arrays.sort(players, new ComparatorGoal());
		for( Player c: players)
			System.out.println(c);
		}
}

