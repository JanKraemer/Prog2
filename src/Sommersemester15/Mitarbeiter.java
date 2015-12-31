package Sommersemester15;

import java.io.*;
import java.util.*;

public class Mitarbeiter implements Serializable{

	private String vorname = null;
	private String nachname = null;
	private int nummer = 0;
	private transient int gehalt = 0;
	
	public Mitarbeiter(String vorname, String nachname,int nummer, int gehalt){
		this.vorname = vorname;
		this.nachname = nachname;
		this.nummer = nummer;
		this.gehalt = gehalt;
	}
	public int getNummer(){
		return nummer;
	}
	public String toString(){
		return "Nachname: " + nachname + " Vorname: " +  vorname +
				" Personalnummer: " + nummer + " Gehalt: " + gehalt;
	}
	public static void legDateiAn(){
		Mitarbeiter[] m = {
						new Mitarbeiter("Hans", "Wurst", 225, 3500),
						new Mitarbeiter ("Max", "Muster", 255, 5000),
						new Mitarbeiter ( "Linda", "Schmitz", 202, 4500)
				};
		try{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mitarbeiter.dat"));
			for(Mitarbeiter c: m)
				oos.writeObject(c);
			oos.close();
		}catch(Exception e)
		{
			e.getMessage();
		}
	}
	public static Collection<Mitarbeiter> leseDatei(){
		LinkedList<Mitarbeiter> member = new LinkedList<Mitarbeiter>();
		try{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mitarbeiter.dat"));
			boolean eof = false;
			while(!eof)
			{
				try{
					Object input = ois.readObject();
					member.add((Mitarbeiter)input);
				}catch(EOFException e)
				{
					eof = true;
				}
			}
			ois.close();
		}catch(Exception e)
		{
				e.getMessage();
		}
		return member;
	}
	public static void gibCollectionAus(Collection<Mitarbeiter> team){
		for(Mitarbeiter m:team)
			System.out.println(m);
	}
	
	public static Mitarbeiter[] sortiere(Collection<Mitarbeiter> team){
		Mitarbeiter[] member = team.toArray(new Mitarbeiter[0]);
		Arrays.sort(member, new VergleichePersonalNummer());
		return member;
	}
	public 	static 	void main(String[] args)
	{
	legDateiAn();
	Collection<Mitarbeiter>	collection	=	leseDatei();
	Mitarbeiter[]	array	=	sortiere(collection);
	gibCollectionAus(Arrays.asList(array));
	}
}
