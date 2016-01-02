package Sommersemester12;

import java.util.Comparator;

public class AnzahlPlaetzeOrdnungskriterium implements Comparator<Stadion>{

	@Override
	public int compare(Stadion o1, Stadion o2) {
		return Integer.compare(o1.getPlaetze(), o2.getPlaetze());
	}

}
