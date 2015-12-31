package Sommersemester13;

import java.util.ArrayList;

public class Menge {

	ArrayList<Object> data;
	
	public Menge(){
		data= new ArrayList<Object>();
	}
	public boolean hinzufuegen(Object c){
		boolean check = true;
		for(Object d:this.data)
			if(d.equals(c))
				check = false;
		if(check)
			this.data.add(c);
		return check;
	}
	public Menge(Object[] data){
		this();
		for(Object d:data)
			this.hinzufuegen(d);
	}
	public Menge schnittmenge(Menge m){
		Menge out = new Menge();
		for(Object c: this.data)
			if(m.data.contains(c))
				out.hinzufuegen(c);
		return out;
	}
	public Menge vereinigung(Menge m){
		Menge out = new Menge();
		for(Object c: m.data)
			out.hinzufuegen(c);
		for(Object d: this.data)
			out.hinzufuegen(d);
		return out;
	}
	public String toString(){
		String output ="[";
		for(Object c:this.data)
			output+= c.toString();
		return output+"]";
	}
}
