package org.elsys.part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BallContainer {

	 List<Ball> balls = new ArrayList<>();

	 double capacity;
		public BallContainer(double capacity) {
			this.capacity = capacity;	
		}
		
		public BallContainer() {

		}
		
		public double getCapacity() {
			return capacity;
		}

	/** 
	 * Adds a ball to the container.
	 * @param b the Ball to be added
	 * @return true if b was successfully added
	 */
	public boolean add(Ball b) {
		if(b != null){
			return balls.add(b);
		}
		else return false;
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
		double maxVolume = 0;
		for(Ball b : balls) {
			maxVolume = maxVolume + b.getVolume();
		}
		return maxVolume;
	}

	public boolean addAll(Collection<Ball> balls) {
		for(Ball b : balls) {		
			balls.add(b);		
		} return balls != null;
	}
	/**
	 * Returns the total count of balls in the container.
	 * @return
	 */
	public int size() {
		return balls.size();
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
		boolean retValue = balls.contains(b);
		return retValue;
	}

}