package Wintersemester1011;

import java.util.HashMap;

public class Notenverzeichnis {

	private String nameStudent_ref;
	private HashMap<String, Float> faecher;
	
	public Notenverzeichnis(String nameStudent_ref){
		this.nameStudent_ref = nameStudent_ref;
		faecher = new HashMap<String, Float>();
	}
	void add(String fach_ref, float note){
		if(!faecher.containsKey(fach_ref))
			faecher.put(fach_ref, note);
	}
	float getNote(String fach_ref){
		if(!faecher.containsKey(fach_ref))
			return 0f;
		return faecher.get(fach_ref);
	}
	public float getNotendurchschnitt(){
		float durchschnitt = 0.0f;
		for(Float c: faecher.values())
			durchschnitt+= c;
		return durchschnitt / faecher.size();
	}
}
