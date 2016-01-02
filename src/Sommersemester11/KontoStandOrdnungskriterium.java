package Sommersemester11;

import java.util.Comparator;

public class KontoStandOrdnungskriterium implements Comparator<Konto>{

	@Override
	public int compare(Konto o1, Konto o2) {
	
		return Double.compare(o1.getKontostand(), o2.getKontostand());
	}
	

}
