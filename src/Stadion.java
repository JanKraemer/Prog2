public class Stadion implements Comparable<Stadion>{

	private String name_ref;
	private int plaetze;
	
	public Stadion(){
		name_ref= "leer";
		plaetze=0;
	}
	public Stadion(String name_ref, int plaetze){
		this.name_ref =name_ref;
		this.plaetze=plaetze;
	}
	public String getName_ref() {
		return name_ref;
	}
	public void setName_ref(String name_ref) {
		this.name_ref = name_ref;
	}
	public int getPlaetze() {
		return plaetze;
	}
	public void setPlaetze(int plaetze) {
		this.plaetze = plaetze;
	}
	@Override
	public int compareTo(Stadion arg0) {
		return this.name_ref.compareTo(arg0.name_ref);
	}
}
