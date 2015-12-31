package Sommersemester13;

public class Geburtstag implements Comparable<Geburtstag> {

	private String name;
	private int tag;
	private int monat;
	private int jahr;
	
	public Geburtstag(){
		this("Max Mustermann", 1, 1,1970);
	}
	public Geburtstag(String name, int tag, int monat, int jahr){
		
		this.name = name;
		this.tag = tag;
		this.monat =monat;
		this.jahr = jahr;
	}
	@Override
	public int compareTo(Geburtstag g) {
		if(Integer.compare(this.jahr, g.getJahr())== 0)
			if(Integer.compare(this.monat, g.getMonat())== 0)
				return Integer.compare(this.tag, g.getTag());
			else return Integer.compare(this.monat, g.getMonat());
		return Integer.compare(this.jahr, g.getJahr());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	public int getMonat() {
		return monat;
	}
	public void setMonat(int monat) {
		this.monat = monat;
	}
	public int getJahr() {
		return jahr;
	}
	public void setJahr(int jahr) {
		this.jahr = jahr;
	}
	public String toString(){
		return this.name + " hat Geburtstag am "+this.tag+":"+this.monat+":"+this.jahr;
	}
	public boolean gleicherTag(Geburtstag g){
		return this.tag == g.getTag() && this.monat == g.getMonat();
	}
	
	

}
