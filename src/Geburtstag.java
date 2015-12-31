
public class Geburtstag implements Comparable <Geburtstag> {
	private String name;
	private int tag;
	private int monat;
	private int jahr;
	static int currentYear = 2015;
	
	public Geburtstag(){
		this("Max Mustermann", 1, 1, 1970);
	}
	
	public int compareTo(Geburtstag g){
		if (Integer.compare(this.jahr, g.jahr)==0)
			if(Integer.compare(this.monat,g.monat)==0)
				return Integer.compare(this.tag, g.tag);
			else return Integer.compare(this.monat, g.monat);
		return Integer.compare(this.jahr, g.jahr);
	}
	// 1 Extra: Check if person is older than 18
	public Geburtstag(String name, int tag, int monat, int jahr) {
		this.name = name;
		this.tag = tag;
		this.monat = monat;
		this.jahr = jahr;
	}
	// 1a
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTag() {
		return this.tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	public int getMonat() {
		return this.monat;
	}
	public void setMonat(int monat) {
		this.monat = monat;
	}
	public int getJahr() {
		return this.jahr;
	}
	public void setJahr(int jahr) {
		this.jahr = jahr;
	}
	// 1b
	@Override
	public String toString() {
		return this.name + " geboren am " + this.tag + "." + this.monat + "." + this.jahr;
	}
	// 1c
	public boolean gleicherTag(Geburtstag g) {
		return this.tag==g.getTag() && this.monat==g.getMonat();
	}
}
