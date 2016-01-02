package Wintersemester1011;

import java.io.*;
import java.util.*;

public class Stream {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String input="";
		try{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("werte.int"));
		while(true){
			try{
				input = scan.nextLine();
				if(input.equals("fertig"))
					break;
				int wert = Integer.parseInt(input);
				if(wert % 5 == 0)
					dos.writeInt(wert);
				
			}catch (NumberFormatException e){
				System.out.println("Falscher Wert " + input);
				continue;
			}
		}
		dos.close();
		scan.close();
	}catch(Exception e){
		e.getMessage();
	}
	}
}
