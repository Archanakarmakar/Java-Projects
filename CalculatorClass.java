package study;

import java.util.Scanner;

public class CalculatorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to the calculator with Switch statement: ");
		System.out.print("Enter the first no:");
		int num1= input.nextInt();
		System.out.println("Enter the second no:");
		int num2= input.nextInt();
		System.out.println("The operation of calculator:");
		String operator= input.next();
		
		int result= switch(operator) {
		case "+" -> num1+num2;
		case "-"-> num1-num2;
		case "*" -> num1*num2;
		case "/" -> num1/num2;
		default ->-1;
		};
		
		System.out.print("the answer is......."+result);
			}

}
