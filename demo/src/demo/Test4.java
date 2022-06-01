package demo;

import java.util.Scanner;

public class Test4 {

	
	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		for(;;) {
			int ch=sc.nextInt();
			a=sc.nextInt();
			b=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
				break;	
			case 3:
				System.out.println(a*b);
				break;
			case 4:
				System.out.println(a/b);
				break;
			case 5:
				System.out.println(a%b);
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Invalid Selection");
			}
		}
		
		

	}

}
