package com.tns.abstractclass;

abstract class Bank{
	abstract float rateofinterest();
}
class SBI extends Bank{

	@Override
	float rateofinterest() {
		// TODO Auto-generated method stub
		return 7.6f;
	}
}
class HDFC extends Bank{

	@Override
	float rateofinterest() {
		// TODO Auto-generated method stub
		return 8;
	}
}
public class Example2 {

	public static void main(String[] args) {
		Bank s = new SBI();
		Bank h = new HDFC();
		System.out.println("The rate of interest in SBI is: " +s.rateofinterest() );
	    System.out.println("The rate of interest in HDFC is : " + h.rateofinterest());
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
