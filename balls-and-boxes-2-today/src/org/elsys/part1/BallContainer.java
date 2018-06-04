package org.elsys.part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BallContainer {
	double capacity;
	List<Ball> balls = new ArrayList<>();
	public BallContainer() {
	}
	
	public BallContainer(double capacity) {
		this.capacity = capacity;
	}

	/** 
	 * Adds a ball to the container.
	 * @param b the Ball to be added
	 * @return true if b was successfully added
	 */
	public boolean add(Ball b) {
		if(b != null)
		return balls.add(b);
		else return false;
	}

	/**
	 * Adds all balls to a container.
	 * @param balls
	 * @return true if all balls were added, false otherwise
	 */
	public boolean addAll(Collection<Ball> balls) {
		for(Ball b : balls) {
			if(!balls.add(b)) return false;
		}
		return true;
	}

	/**
	 * Removes a ball from the container.
	 * @param b the Ball to be removed
	 * @return true if b was present in the collection
	 */
	public boolean remove(Ball b) {
		return balls.remove(b);
	}

	/**
	 * Returns the sum of the volumes of all balls in the container.
	 * @return
	 */
	public double getVolume() {
		int sum = 0;
		for(Ball b : balls) {
			sum += b.getVolume();
		}
		return sum;
	}

	/**
	 *  Removes all balls from the container.
	 */
	public void clear() {
		balls.clear();
	}

	/**
	 * Checks whether a Ball is present in the container.
	 * @param b the Ball to check
	 * @return true if b is present
	 */
	public boolean contains(Ball b) {
		return balls.contains(b);
	}

}