package Wintersemester1213;

import java.util.*;

public class TestKonfigurator {

	public static void main(String[] args){
		
		Konfigurationsleser kl = new Konfigurationsleser("faxconfig.txt");
		Map<String,String> config = kl.dateiLesen();
		System.out.println("Key\t\t\tValue");
		int i = 0;
		for (String c: config.keySet())
			if (i == 0){
				i++;
				System.out.println(c+"\t\t\t"+config.get(c));
			}else 
				System.out.println(c+"\t\t"+config.get(c));
		
	}
}
