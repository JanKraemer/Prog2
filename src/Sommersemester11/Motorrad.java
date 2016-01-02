package Sommersemester11;

public class Motorrad extends Fahrzeug{

	private String fahrzeugtyp = "Motorrad";
	
	public Motorrad(String herstellerName, float preis){
		super(herstellerName, preis);
	}
	public String toString(){
		return super.toString() + " , Fahrzeugtyp: " + fahrzeugtyp;
	}
}
