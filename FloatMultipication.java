package study;

import java.util.Scanner;

public class FloatMultipication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to the Float multipication : ");
		System.out.println("Enter the first no:");
		double num1= input.nextDouble();
		System.out.println("Enter the second no:");
		double num2= input.nextDouble();
		 double mul= num1*num2;
		 
		 System.out.println(" The Float multipication result : "+mul);
		 
	}

}
