package Wintersemester1011;

import java.util.ArrayList;
import java.util.Arrays;

public class Smartphone implements Comparable<Smartphone>{

	private String name;
	private double preis;
	private long seriennummer;
	
	private static long number = 1000;
	private static ArrayList<Smartphone> all = new ArrayList<Smartphone>();
	
	public Smartphone(String name, double preis){
		this.name = name;
		this.preis = preis;
		this.seriennummer = number;
		number+= 120;
		all.add(this);
	}
	public String toString(){
		return this.name + " kostet " + this.preis + " und hat die SN: " + this.seriennummer;
	}
	
	@Override
	public int compareTo(Smartphone o) {
		return Long.compare(this.seriennummer,o.seriennummer);
	}
	public Smartphone[] getAllSmartphones(){
		Smartphone[] out = all.toArray(new Smartphone[0]);
		Arrays.sort(out);
		return out;
	}

}
