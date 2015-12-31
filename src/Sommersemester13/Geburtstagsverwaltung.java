package Sommersemester13;

import java.util.*;

public class Geburtstagsverwaltung {
	
	HashMap<String,Geburtstag> bdays;

	public Geburtstagsverwaltung(){
		bdays = new HashMap<String,Geburtstag>();
	}
	public void addGeburtstag(Geburtstag tag){
		if(!bdays.containsKey(tag.getName()))
			bdays.put(tag.getName(), tag);
	}
	public Geburtstag getGeburtstag(String name){
		return bdays.get(name);
	}
	public String[] alleNamenAmGleichenTag(Geburtstag tag){
		ArrayList<String> names = new ArrayList<String>();
		for(Geburtstag g:bdays.values())
			if(g.gleicherTag(tag))
				names.add(g.getName());
		return names.toArray(new String[0]);		
	}
	public Geburtstag[] alleGeburtstage(){
		return bdays.values().toArray(new Geburtstag[0]);
	}
	public Geburtstag[] alleGeburtstageNachDatum(){
		Geburtstag[] days = this.alleGeburtstage();
		Arrays.sort(days);
		return days;
	}
}
