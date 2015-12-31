package Wintersemester1314;

import java.util.Iterator;

public class SquareNumbers implements Iterable<Integer> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareNumbers listOfSquares = new SquareNumbers();
		for ( Integer i : listOfSquares)
			System.out.println(i);
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new SquareNumberIterator();
	}

}
