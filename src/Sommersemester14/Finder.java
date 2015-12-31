package Sommersemester14;

import java.io.*;

public class Finder {

	public BufferedReader getSystemInAsBufferedReader(){
		return new BufferedReader(new InputStreamReader(System.in));
	}
	public void findStringInFiles(String searchString, String[] filenames){
		BufferedReader br = null;
		for(int i = 0;i< filenames.length;i++){
			try{
			br = new BufferedReader(new InputStreamReader(new FileInputStream(filenames[i])));	
			String line = "";
			int zeile = 1;
				while((line = br.readLine())!= null){
					if(line.contains(searchString))
						System.out.println(filenames[i] +" " +zeile);
						zeile++;
				}
			}catch(IOException e){
				System.out.println("Datei "+ filenames[i] +" konnte nicht geöffnet werden!");
			}
		}
	}
		
	public static void main(String[] args){
		Finder finder = new Finder();
		BufferedReader br = finder.getSystemInAsBufferedReader();
		String searchString = null;
		try{
			searchString = br.readLine();
			finder.findStringInFiles(searchString,  args);
			br.close();
		}catch(IOException ex){
			System.out.println("Einlesen fehlgeschlagen.");
		}
	}
}
