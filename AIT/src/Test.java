class Employee {
    int id;
    String name;
    float salary;
    Employee() {
        System.out.println("user defined no-argument "
        + "constructor executed");
    }
    public Employee(int i, String n, float s) {
		id=i;
		name=n;
		salary=s;
	}
	void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

class Test {
  public static void main(String[] args) {
      Employee e1 = new Employee(111,"lekha",5000.0f);
      Employee e2 = new Employee();
      
      e1.display();
      e2.display();


  }
  
}
