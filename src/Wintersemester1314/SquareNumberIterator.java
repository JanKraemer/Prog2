package Wintersemester1314;

import java.util.Iterator;

public class SquareNumberIterator implements Iterator<Integer> {

	int x = 1;
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return Math.pow(x, 2) <= Integer.MAX_VALUE;
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return (int)Math.pow(x++, 2);
	}
	public void remove(){
		throw new UnsupportedOperationException();
	}

}
