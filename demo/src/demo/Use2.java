package demo;

class demo{
	
	demo(){
	
		this(5);
		System.out.println("Hello students");
	}
	demo(int x){
		this(6,7);
		System.out.println(x);
	}
	demo(int x, int y){
		System.out.println(x + " "+ y);
	}
	
}
public class Use2 {

	public static void main(String[] args) {
		demo d = new demo();

	}

}
