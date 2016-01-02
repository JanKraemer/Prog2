package Sommersemester12;

import java.io.*;

public class Zeichenaufgabe {

public static void main(String[] args){
		
		DataInputStream dis;
		int gerade=0;
		int ungerade = 0;
		int negativ =0;
		
		try{
			// den DataInputStream können wir dafür nutzen..  Methode gechanged massively
			dis =new DataInputStream(new FileInputStream("zeichendatei.txt"));
			int zahl;
			boolean eof = false;
			while(!eof){
				try{
					zahl = (int) dis.readInt();
					if (zahl<0)negativ++;
					if(zahl%2==0) gerade++;
					else ungerade++;
				}catch(EOFException e){
					eof = true;
				}
			}
			dis.close();
		}catch(Exception e){
			System.exit(-1);
		}
		
		BufferedWriter bw;
		try{
			// bw.newLine() um einen Zeilenumbruch zu generieren
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("anzahl.txt")));
			bw.write("Anzahl gerade: "+ gerade);
			bw.newLine();
			bw.write("anzahl ungerade: "+ ungerade);
			bw.newLine();
			bw.write("Anzahl negativ: "+ negativ);
			bw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

