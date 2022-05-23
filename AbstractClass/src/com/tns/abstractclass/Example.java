package com.tns.abstractclass;

abstract class Shape{
	abstract void draw();
	int i;
	
}
class rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("drawing rectangle");
		
	}
	
}
public class Example {

	public static void main(String[] args) {
		rectangle r = new rectangle();
		Shape s = new rectangle();

		s.draw();
		r.draw();
	}

}
