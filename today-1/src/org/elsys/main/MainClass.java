package org.elsys.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.elsys.part1.Ball;
import org.elsys.part1.BallContainer;
import org.elsys.part1.Box;
import org.elsys.part1.Color;

public class MainClass {
	 public static void main(String[] args) {

	        List<Integer> mainArguments = new ArrayList<Integer>();

	        for (String arg : args) {
	            if (arg != null) {
	                mainArguments.add(Integer.parseInt(arg));
	            }
	        }

	       

	        List<Ball> balls = new ArrayList<Ball>();

	        for (Integer number : mainArguments) {
	            if (number % 2 == 0) {
	            	balls.add(new Ball(2.1, Color.WHITE));
	            } else balls.add(new Ball(2.1, Color.BLACK));

	        }

	        BallContainer ballContainer = new BallContainer();
	        
	        for(Ball b : balls) {
	        	ballContainer.add(b);
	        }

	        	Iterator<Ball> ballsFromSmallestIterator 
	        	= ((Box) ballContainer).getBallsFromSmallest();
	        	
	        Box sortedBox = new Box(100);

	        while (ballsFromSmallestIterator.hasNext()) {
	            sortedBox.add(ballsFromSmallestIterator.next());
	        }
	}
}
