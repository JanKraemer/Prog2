
import java.util.Comparator;

public class AnzahlPlaetzeOrdnungsKriterium implements Comparator <Stadion> {
	
	// Shorter Solution :)
	public int compare(Stadion s1, Stadion s2){
		return Integer.compare(s1.getPlaetze(), s2.getPlaetze());
	}
}
