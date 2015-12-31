package Wintersemester1314;

import java.util.Arrays;

public class Date implements Comparable<Date>{
	
	private int day,month, year;
	
	public int compareTo(Date other){
		if(Integer.compare(this.year,other.year)== 0)
			if(Integer.compare(this.month, other.month)== 0)
				return Integer.compare(this.day, other.day);
			else return Integer.compare(this.month, other.month);
		return Integer.compare(this.year,other.year);
	}
	
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String toString(){
		return day +"."+month+"."+year;
	}
	public static void main(String[] args){
		Date[] dates = new Date[]{
				new Date(31,12,2014),
				new Date(15,3,-44),
				new Date(9,11,1989),
				new Date(3,10,1990)
		};
		Arrays.sort(dates);
		for(Date c : dates)
		System.out.println(c);
	}

}
