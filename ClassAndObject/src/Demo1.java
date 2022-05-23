
public class Demo1 {

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
	    obj.start();
	  }
	  void start() {
	    String stra = "do";
	    String strb = method(stra);
	    System.out.println(stra);
	  //  System.out.print(": " + stra + strb);
	  }
	  String method(String stra) {
	    stra = stra + "good";
	   System.out.println(stra);
	    return " good";
	  }


}
