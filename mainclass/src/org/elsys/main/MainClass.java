package org.elsys.main;

import java.util.Scanner;

import org.elsys.part1.Ball;
import org.elsys.part1.BallContainer;
import org.elsys.part1.Box;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Box box = new Box(100);
		BallContainer ballContainer = new BallContainer();
		while (true) {
			String line = sc.nextLine();

			if (line.equals("END")) {
				break;
			}

			String[] arguments = line.split(",");
			Ball ball = new Ball(Double.parseDouble(arguments[0]), arguments[1]);
			try {
				box.add(ball);
				System.out.println("Added");
			} catch (RuntimeException ex) {
				ballContainer.add(ball);
			}
		}
		sc.close();
	}
}