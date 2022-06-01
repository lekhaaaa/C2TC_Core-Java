package demo;


import java.util.Collections;
import java.util.Iterator;


public class check {
	
	public enum Season{
		  winter(5),spring(10),AUTUMN(15),SUMMER(20);

		int j;
		Season(int i) {
			this.j=i;
		}
	  }
	public static void main(String[] args) {
		for(Season s : Season.values()) {
			System.out.println(s + " " + s.j);
		}  
	}

}
