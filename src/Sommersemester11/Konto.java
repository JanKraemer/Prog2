package Sommersemester11;

import java.util.*;
import java.io.*;

// leider ist mir das Testen der Klasse nicht gelungen, dafür müsste ich einen Anderen Stream nutzen!

public class Konto {

	private int kontonummer;
	private double kontostand;
	private double zinssatz;
	
	public Konto(){
		
	}
	
	public Konto(int kontonummer, double kontostand, double zinssatz){
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
		this.zinssatz = zinssatz;
	}

	public int getKontonummer() {
		return kontonummer;
	}

	public double getKontostand() {
		return kontostand;
	}

	public double getZinssatz() {
		return zinssatz;
	}
	public Vector<Konto> liesAlleKonten() throws Exception{
		Vector<Konto> konten = new Vector<Konto>();
		DataInputStream dis = null;
		int kontonummer = 0;
		double kontostand = 0;
		double actual = 0;
		boolean eof = false;
		dis = new DataInputStream(new FileInputStream("kontodaten.txt"));
			while(!eof){
				try{
					actual = dis.readDouble();
					if(kontonummer != 0 && kontostand != 0){
						konten.add(new Konto(kontonummer,kontostand,actual));
						kontonummer = 0;
						kontostand = 0;
					}
					else if(kontonummer!= 0)
						kontostand = actual;
					else
						kontonummer = (int)actual;
				}catch(EOFException e){
					eof = true;
				}
			}
		dis.close();
		return konten;
	}
	public Konto[] getKontoNachStandSortiert(Vector<Konto> vector_ref, KontoStandOrdnungskriterium ordkrit_ref){
		Konto[] konten = vector_ref.toArray(new Konto[0]);
		Arrays.sort(konten, ordkrit_ref);
		return konten;
	}
	public void schreibeTextDatei(Konto[] alleKonten_ref) throws Exception{
		
		FileWriter fw = new FileWriter("negativerKontostand.txt");
		for(Konto c:alleKonten_ref)
			if(c != null)
				fw.write("Kontonummer: "+c.kontonummer +", Kontostand:"+c.kontostand);
		fw.close();
	}

}
