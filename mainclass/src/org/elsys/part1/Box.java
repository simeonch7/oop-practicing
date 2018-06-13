package org.elsys.part1;

import java.util.Collections;
import java.util.Iterator;

public class Box extends BallContainer {

	public Box(double capacity) {
		this.capacity = capacity;
	}
	
	public boolean add(Ball b) {
		if(b != null) {
			if(capacity >= getVolume() + b.getVolume())return balls.add(b);
			else throw new RuntimeException();
		}else return false;
	}
	public Iterator<Ball> getBallsFromBiggest() {
		Collections.sort(balls, (s1, s2) -> (int)(s2.getVolume()-s1.getVolume()));
		return balls.listIterator();
	}

}