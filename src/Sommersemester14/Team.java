package Sommersemester14;

import java.util.LinkedList;

public class Team extends AbstractTeam {

	public Team(){
		members = new LinkedList<Player>();
	}
	@Override
	Player[] getPlayers() {
		// TODO Auto-generated method stub
		return members.toArray(new Player[0]);
	}

	@Override
	Player playerByName(String name) {
		// TODO Auto-generated method stub
		for(Player c: members)
			if(name.equals(c.getName()))
				return c;
		return null;
	}

	@Override
	boolean playerInTeam(String name) {
		// TODO Auto-generated method stub
		if(playerByName(name)!= null)
			return true;
		return false;
	}

	@Override
	void addPlayerToTeam(String name) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if(playerByName(name)!= null)
			throw new IllegalArgumentException("Spieler bereits vorhanden!");
		members.add(new Player(name));
	}

	@Override
	Player removePlayerFromTeam(String name) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if(playerByName(name)== null)
			throw new IllegalArgumentException("Spieler nicht im Team");
		Player out = playerByName(name);
		members.remove(out);
		return out;
	}

	@Override
	void substitutePlayer(String nameOfReplacedPlayer, String nameOfNewPlayer)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
			Player removed;
		try{
			removed = removePlayerFromTeam(nameOfReplacedPlayer);
		}catch(IllegalArgumentException e){
			throw new IllegalArgumentException("Auszuwechselnder Spieler nicht im Team");
		}
		try{
			addPlayerToTeam(nameOfNewPlayer);
		}catch(IllegalArgumentException e){
			members.add(removed);
			throw new IllegalArgumentException("Einzuwechselnder Spieler bereits im Team");
		}
	}

}
