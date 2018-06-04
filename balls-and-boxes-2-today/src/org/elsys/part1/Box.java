package org.elsys.part1;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Box extends BallContainer{

	public Box(double capacity) {
		super(capacity);
	}

	public boolean add(Ball b) {
		if(b != null) {
			if(getVolume() + b.getVolume() <= capacity)
				return balls.add(b);
			else throw new NotEnoughCapacityException();
		}
		else return false;
	}
	
	public boolean addAll(Collection<Ball> bs) {
		for(Ball b : bs) {
			if(getVolume() + b.getVolume() <= capacity) {
				balls.add(b);
			}else throw new NotEnoughCapacityException();
		}
		return true;
	}
	
	public Iterator<Ball> getBallsFromSmallest() {
		Collections.sort(balls, (s1, s2) -> (int)(s1.getVolume()-s2.getVolume()));
		return  balls.listIterator();
	}

}