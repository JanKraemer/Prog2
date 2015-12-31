import java.io.*;
import java.util.*;

// Deine Klasse an sich funktioniert soweit, nach der Sortierung gut
public class Mitarbeiter implements Serializable
{
	// Beispiel einer InnerClass für den Comparator :)
	private static class VergleichePersonalNummer implements Comparator<Mitarbeiter>
	{
		@Override
		public int compare(Mitarbeiter arg0, Mitarbeiter arg1) {
			return Integer.compare(arg0.getNummer(), arg1.getNummer());
		}
	}

	private String vorname =null;
	private String nachname = null;
	private int nummer = 0;
	private transient int gehalt = 0;
	
	public Mitarbeiter (String vorname, String nachname, int nummer, int gehalt){
		this.vorname = vorname;
		this.nachname = nachname;
		this.nummer=nummer;
		this.gehalt=gehalt;
	}
	
	public int getNummer(){
		return nummer;
	}
	public String toString(){
		return " Nachname: " + nachname + " Vorname: " + vorname + " Personalnummer: " + nummer + " Gehalt: " + gehalt;
	}
	//b) Du kannst gerne in Prog 2 auf nur einen Exception Block zugreifen:-)
	public static void legDateiAn(){
		Mitarbeiter[] m = {
				new Mitarbeiter("Hans", "Wurst", 225, 3500),
				new Mitarbeiter ("Max", "Muster", 255, 5000),
				new Mitarbeiter ( "Linda", "Schmitz", 202, 4500)
		};
		ObjectOutputStream oos = null;
		try{
			oos = new ObjectOutputStream(new FileOutputStream("mitarbeiter.dat"));
				for (int i =0; i<m.length; i++)
					oos.writeObject(m[i]);
		oos.close();	
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	//c) Super Methode
	public static Collection <Mitarbeiter> leseDatei(){
		Collection <Mitarbeiter> col = new ArrayList<Mitarbeiter>();
		ObjectInputStream ois=null;
		boolean eof=false;
		try{
			ois = new ObjectInputStream(new FileInputStream("mitarbeiter.dat"));
			while (!eof)
			{
				try{
					Object o = ois.readObject();
					col.add((Mitarbeiter)o);
				}
				catch(EOFException e){
				eof=true;
				}
			}
			ois.close();	
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return col;
	}
	
	//d)
	public static void gibCollectionAus (Collection<Mitarbeiter> team){
		for(Mitarbeiter m : team)
			System.out.println(m);
	}
	
	//e)
	public static Mitarbeiter[] sortiere (Collection<Mitarbeiter>team){
		Mitarbeiter[] liste = new Mitarbeiter[team.size()];
		int i=0;
		for (Mitarbeiter m : team)
			liste[i++]= m;
		// Mein Vorschlag
		// Mitarbeiter[] liste = team.toArray(new Mitarbeiter[0]);
		Arrays.sort(liste, new VergleichePersonalNummer());
		// HIER FEHLT WAS
		return liste;
	}
	//f)
	public static void main(String[] args){
		legDateiAn();
		Collection<Mitarbeiter> collection = leseDatei();
		Mitarbeiter[] array = sortiere(collection);
		gibCollectionAus(Arrays.asList(array));
	}

}


