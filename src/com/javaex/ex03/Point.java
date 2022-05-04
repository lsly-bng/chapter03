package com.javaex.ex03;

public class Point {

	// field
	private int x;
	private int y;

	// constructor
	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// method - g/s
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	// method - general
	@Override
	public boolean equals (Object obj) {
		Point p = (Point) obj;
		
		if ((this.x == p.x)&&(this.y== p.y)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
