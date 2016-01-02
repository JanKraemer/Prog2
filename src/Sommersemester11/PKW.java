package Sommersemester11;

public class PKW extends Fahrzeug{

	private String fahrzeugtyp = "PKW";
	private String modellBezeichnung;
	
	public PKW(String herstellerName, float preis, String modellBezeichnung) {
		super(herstellerName, preis);
		this.modellBezeichnung = modellBezeichnung;
	}
	public String toString(){
		return super.toString() + ", Modell: " + modellBezeichnung + 
				" ,Fahrzeugtyp: "+ fahrzeugtyp;
	}
	

}
