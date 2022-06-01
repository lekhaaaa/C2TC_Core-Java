package demo;

import java.util.Scanner;

public class Trial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0,count=0,j=0;
		
		System.out.println("Enter a number");
		int n = sc.nextInt();	
		
		while(j<n) {
			int num=sc.nextInt();
			sum+=num; //0+1 =1 //1+2 =3
			j++; //1 //2
		}
		
		int mean = sum/n;
		System.out.println("Mean is: " + mean);
		
	}

}
