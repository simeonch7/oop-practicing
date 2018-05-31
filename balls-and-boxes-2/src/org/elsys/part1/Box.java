package org.elsys.part1;

import java.util.Collections;
import java.util.Iterator;

public class Box extends BallContainer{
	
	public Box(double capacity) {
		super(capacity);
	}

	public Iterator<Ball> getBallsFromSmallest() {
		Collections.sort(balls, (s1, s2) -> (int)(s1.getVolume()-s2.getVolume()));
		return  balls.listIterator();
	}

}