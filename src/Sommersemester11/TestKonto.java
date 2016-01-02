package Sommersemester11;

import java.io.*;
import java.util.*;

public class TestKonto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		schreibeKontodaten();

	}
	public static void schreibeKontodaten(){
		DataOutputStream dos = null;
		try{
		dos = new DataOutputStream(new FileOutputStream("kontodaten.txt"));
		dos.writeInt(123);
		dos.writeDouble(245.45);
		dos.writeDouble(0.05);
		dos.writeInt(120);
		dos.writeDouble(2145.0);
		dos.writeDouble(0.5);
		dos.writeInt(125);
		dos.writeDouble(42.0);
		dos.writeDouble(0.8);
		dos.close();
		}catch(Exception e){
			e.getMessage();
		}
		
	}

}
