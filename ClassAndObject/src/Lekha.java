
 class Lekha1 {
    int id;
    String name;
    float salary;
    Lekha1() {
        System.out.println("user defined no-argument " + "constructor executed");
    }
    Lekha1(int i, String n, float d) {
		id=i;
		name=n;
		salary=d;
	}
	void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}
public class Lekha{
	public static void main(String[] args) {
		Lekha1 e1 = new Lekha1(1,"xyz",50.0f);
		Lekha1 e2 = new Lekha1();
        
        e1.display();
        e2.display();

	}

}
