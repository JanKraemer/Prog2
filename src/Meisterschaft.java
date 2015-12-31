import java.util.Arrays;
import java.util.Vector;

public class Meisterschaft {
	private Vector<Stadion> v;
	public Meisterschaft(){
		v = new Vector<Stadion>();
	}
	public boolean istStadionEnthalten(String name_ref){
		for(Stadion s : v)
			if (s.getName_ref().equals(name_ref))
				return true;
		return false;
	}
	public void stadionEinfuegen(Stadion stadion_ref)throws StadionverwaltungException{
		if (v.contains(stadion_ref))
			throw new StadionverwaltungException();
		v.add(stadion_ref);
	}
	public void stadionLoeschen(Stadion name_ref)throws StadionverwaltungException{
		if(!v.contains(name_ref))
			throw new StadionverwaltungException();
		v.remove(name_ref);
	}
	// Bessere Loesung ist folgende
	public Stadion[] getAlleStadien(){
		return v.toArray(new Stadion[0]);
	}
	public Stadion[] getAlleStadienSortiert(){
		Stadion[] st = getAlleStadien();
		Arrays.sort(st, new AnzahlPlaetzeOrdnungsKriterium());
		return st;
	}
	public Stadion[] getStadionByName(){
		Stadion[] st = getAlleStadien();
		Arrays.sort(st);
		return st;
	}
}
