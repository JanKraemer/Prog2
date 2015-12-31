package Wintersemester1415;

import java.io.*;

public class TextDatei {

	public static void main(String[] args){
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("data.txt")));	
		String line ="";
		while(line != null)
		line = br.readLine();
		}catch(Exception e){
			e.getMessage();
		}
	}
}