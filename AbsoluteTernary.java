package study;

import java.util.Scanner;

public class AbsoluteTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to Absolute ternary no: ");
		System.out.print("Enter your no");
		int num= input.nextInt();
		int result= ((num>=0)? num: -num);
		System.out.println("Welcome to Absolute ternary no: "+ result);
	}

}
