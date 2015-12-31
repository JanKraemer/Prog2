package Wintersemester1415;

import java.util.*;


public class Aktiendepot {

	private static class ComparatorName implements Comparator<Aktie>{
		
		public int compare(Aktie a, Aktie b){
			return a.getName().compareTo(b.getName());
		}	
	}
	private static class ComparatorWert implements Comparator<Aktie>{
		
		public int compare(Aktie a, Aktie b){
			return Double.compare(a.wert(), b.wert());
		}	
	}
	
	private HashMap<String,Aktie> depot;
	
	public Aktiendepot(){
		depot = new HashMap<String, Aktie>();
	}
	public void bucheAktieEin(Aktie a){
		if(!depot.containsKey(a.getName()))
			depot.put(a.getName(), a);
	}
	public Aktie leseAktieAus(String name){
		return depot.get(name);
	}
	public Aktie[] alleAktien(){
		return depot.values().toArray(new Aktie[0]);
	}
	public Aktie[] alleAktienNachNamen(){
		Aktie[] all = this.alleAktien();
		Arrays.sort(all, new ComparatorName());
		return all;
	}
	public Aktie[] alleAktienNachWert(){
		Aktie[] all = this.alleAktien();
		Arrays.sort(all, new ComparatorWert());
		return all;
	}
}
