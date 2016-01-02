package Sommersemester12;

import java.io.*;

public class TestZeichenDatei {
	public static void main(String[] args)throws Exception
	{
		// FileOutputStream ist hier angebrachter um die Dateien auch Binaer zu schreiben
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("zeichendatei.txt"));
		try{
			dos.writeInt(6);
			dos.writeInt(1);
			dos.writeInt(-5);
			dos.writeInt(-6);
			dos.writeInt(7); 		// gerade 2, ungerade 3, negativ 2 sollte jetzt in der anzahl.txt datei stehen
			dos.close();
		}catch(Exception e){
			e.getMessage();
		}
		
	}
	

}


