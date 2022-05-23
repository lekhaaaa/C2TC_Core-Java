package com.tns.abstractclass;

abstract class Bike{
	
	Bike(){
		System.out.println("Bike is created");
	}
	abstract void run();
	void changegear() {
		System.out.println("Gear is changed");
	}
}
class Honda extends Bike{

	@Override
	void run() {
		System.out.println("running safely...!");
		
	}
	
}
public class Example3 {

	public static void main(String[] args) {
		Honda h = new Honda();
		h.run();
		h.changegear();

	}

}
