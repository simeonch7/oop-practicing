package org.elsys.part1;

public class Ball {
	double volume;
	Color color;
	
	public Ball(double volume, Color color) {
		this.volume = volume;
		this.color = color;
	}

	public Ball(double volume) {
		this.volume = volume;
		this.color = Color.WHITE;
	}

	public double getVolume() {
		return volume;
	}

	public Color getColor() {
		return color;
	}
}