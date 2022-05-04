	package com.javaex.ex05;

public class Rectangle {

	//field
	private int width;
	private int height;

	//constructor
	public Rectangle() {
		super();
	}
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	// method -g/s
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	//method - general
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	public boolean equals (Object obj) {
		Rectangle a = (Rectangle) obj;
		if ((this.width*this.height)==(a.width*a.height)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
}
