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
			if(getCapacity() > 0) {
				if(b.getVolume() + getVolume() <= getCapacity()) {
					return balls.add(b);
				}else throw new NotEnoughCapacityException();
			}return balls.add(b);
		}
		else return false;
	}

	/**
	 * Adds all balls to a container.
	 * @param balls
	 * @return true if all balls were added, false otherwise
	 */
	public boolean addAll(Collection<Ball> balls) {
		double maxVolume = 0;
		for(Ball b : balls) {		
			maxVolume += b.getVolume();
			if(maxVolume < getVolume()) {
				balls.add(b);
			}else throw new NotEnoughCapacityException();
		}return true;
	
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
		double sum = 0;
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