package Wintersemester1213;

import java.io.*;
import java.util.*;

public class Konfigurationsleser {

	private String dateiname;
	
	public Konfigurationsleser(String dateiname){
		this.dateiname = dateiname;
	}
	public Map<String,String> dateiLesen(){
		HashMap<String,String> lines = new HashMap<String, String>();
		BufferedReader br = null;
		try{
			br = new BufferedReader(new InputStreamReader(new FileInputStream(dateiname)));
			String line ="";
			while((line = br.readLine()) != null){
				if(line.isEmpty())
					continue;
				String[] part = line.split("=");
				lines.put(part[0], part[1]);
			}
			br.close();
		}catch(Exception e)
		{
			e.getMessage();
		}
		return lines;
	}
}
