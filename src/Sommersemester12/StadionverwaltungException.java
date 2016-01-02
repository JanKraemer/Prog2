package Sommersemester12;

public class StadionverwaltungException extends Exception{

	public StadionverwaltungException(){
		this("Fehler - StadionException");
	}
	public StadionverwaltungException(String text){
		super(text);
	}
}
