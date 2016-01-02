package Sommersemester12;

import java.util.*;

public class Meisterschaft {

	Vector<Stadion> stadien;
	
	public Meisterschaft(){
		stadien = new Vector<Stadion>();
	}
	public boolean istStadionEnthalten(String name_ref){
		for(Stadion c: stadien)
			if(c.getName().equals(name_ref))
				return  true;
		return false;
	}
	public void stadionEinfuegen(Stadion stadion_ref) throws StadionverwaltungException{
		if(istStadionEnthalten(stadion_ref.getName()))
			throw new StadionverwaltungException("Stadion ist bereits vorhanden!");
		stadien.add(stadion_ref);
	}
	public void stadionLoeschen(Stadion stadion_ref) throws StadionverwaltungException{
		if(stadien.contains(stadion_ref))
			throw new StadionverwaltungException("Stadion ist nicht enthalten!");
		stadien.remove(stadion_ref);
	}
	public Stadion[] getAlleStadien(){
		return stadien.toArray(new Stadion[0]);
	}
	public Stadion[] getAlleStadienSortiert(){
		Stadion[] st = getAlleStadien();
		Arrays.sort(st,new AnzahlPlaetzeOrdnungskriterium());
		return st;
	}
}
