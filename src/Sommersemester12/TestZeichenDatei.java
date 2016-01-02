package Sommersemester12;

import java.io.FileOutputStream;

public class TestZeichenDatei {
	public static void main(String[] args)throws Exception
	{
		// FileOutputStream ist hier angebrachter um die Dateien auch Binaer zu schreiben
		FileOutputStream fos = new FileOutputStream("zeichendatei.txt");
		try{
			fos.write(6);
			fos.write(1);
			fos.write(-5);
			fos.write(-6);
			fos.write(7); 		// gerade 2, ungerade 3, negativ 2 sollte jetzt in der anzahl.txt datei stehen
			fos.close();
		}catch(Exception e){
			e.getMessage();
		}
		
	}
	

}


