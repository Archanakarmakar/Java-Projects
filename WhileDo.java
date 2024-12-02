package study;

import java.util.Scanner;

public class WhileDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;

		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to Age for While Loop: ");
		System.out.print("Enter your Age:");
		 age= input.nextInt();
		
		while(age < 0 || age > 100) {
		System.out.print("Enter your Age:");
	      age= input.nextInt();
	}
		System.out.println(" your Age is" +age);
	}
}
