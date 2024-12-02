package study;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
       do {
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to Age for DO While Loop: ");
		System.out.print("Enter your Age:");
		 age= input.nextInt();		
       }while(age < 0 || age > 100) ;
       	System.out.print(" your Age:"+age);
	}
}
