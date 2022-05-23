class Demo{
	float x;
}

public class TestDemo {

	public static void main(String[] args) {
		
		Demo myObj1 = new Demo();
		Demo myObj2 = new Demo();
	     myObj1.x=40;
	     myObj2.x=50;
	     myObj1=null;
		System.out.println(myObj1.x);
		System.out.println(myObj2.x);

	}

}
