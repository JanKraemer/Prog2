package Wintersemester1213;

import java.util.*;

public class TestBruch {

	public static void main(String[] args) {
		LinkedList<Bruch> bruch = new LinkedList<Bruch>();
		bruch.add(new Bruch(1,4));
		bruch.add(new Bruch(2,3));
		bruch.add(new Bruch(1,8));
		bruch.add(new Bruch(4,17));
		bruch.add(new Bruch(-4,5));
		try{
			bruch.add(new Bruch(2,0));
		}catch(ArithmeticException e)
		{
			e.getMessage();
		}
		Collections.sort(bruch);
		for(Bruch c: bruch)
			System.out.println(c);
	}

}
