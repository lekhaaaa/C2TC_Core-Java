package demo;

class demo1{
	 
	void m(demo1 a) {
		System.out.println("in method m");
	}
	void p() {
		m(this);
		System.out.println("in method p");
	}
}
public class Use3 {

	public static void main(String[] args) {
		demo1 d1 = new demo1();

		d1.p();
		
	}

}
