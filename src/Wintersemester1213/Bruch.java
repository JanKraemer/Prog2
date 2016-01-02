package Wintersemester1213;

public class Bruch implements Comparable<Bruch>{

	private int zaehler;
	private int nenner;
	
	public Bruch(int zaehler, int nenner){
		if(nenner > 0)
			this.nenner = nenner;
		else 
			throw new ArithmeticException("Nenner darf nicht 0 sein!");
		this.zaehler = zaehler;
	}
	public Bruch(int wert){
		this(wert,1);
	}
	public Bruch(){
		this(0);
	}
	public String toString(){
		return this.zaehler+" / "+ this.nenner;
	}
	@Override
	public int compareTo(Bruch o) {
		return Double.compare((double)this.zaehler/this.nenner, (double)o.zaehler/o.nenner);
	}
}
