
import java.util.*;

public class GeburtstagsVerwalt {
	
	//a)
	HashMap <String,Geburtstag> map ;
	public GeburtstagsVerwalt(){
		map = new HashMap<String,Geburtstag>();
	}
	//b) // Kommentar Jan : "!" wurde vergessen, dadurch war die ganze Methode in sich falsch!!
	public void addGeburtstag( Geburtstag tag){
		if(!map.containsKey(tag.getName()))
		map.put(tag.getName(), tag);
	}
	//c) // Kommentar Jan : sollte ein Eintrag nicht gefunden werden , ist er automatisch null.
	public Geburtstag getGeburtstag(String name){
		if (map.containsKey(name))
			return map.get(name);
		return null;
	}
	//d)  // Kommentar  Jan : Deine Methode gibt ein Array der MaximalenGröße zurueck !! Nicht sauber implementiert
	public String[] alleNamenAmGleichenTag (Geburtstag tag){
		
		String [] liste = new String [map.size()];
		int i = 0;
		for(Geburtstag g : map.values())
			if (tag.gleicherTag(g))
				liste[i++] = g.getName();	
		return liste;
	}
	
	//e) Kommentar Jan : geht viel einfacher, aber so ist es möglich! Einzeiler möglich!
	public Geburtstag[] alleGeburtstage(){
		
		Geburtstag[] liste = new Geburtstag[map.size()];
		int i = 0;
		for (Geburtstag g : map.values())
			liste[i++] = g;	
		return liste;
	}
	
	//f) Gut gelöst!
	public Geburtstag[] alleGeburtstageNachDatum(){
		Geburtstag[] liste =alleGeburtstage();
		Arrays.sort(liste);
		return liste;
	}
	
	

	
}
