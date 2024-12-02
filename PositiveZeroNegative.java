package study;

import java.util.Scanner;

public class PositiveZeroNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to check the digits: ");
		System.out.println("Enter the digit:");
		int x= input.nextInt();
		if(x>0) {
			System.out.println("your no is positive number");
		}else if(x == 0) {
			System.out.println("your no is zero number");
		}else {
			System.out.println("your no is Negative number");
		}
		
	}

}
