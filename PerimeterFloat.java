package study;

import java.util.Scanner;

public class PerimeterFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to the perimeter of 4 sides : ");
		System.out.println("Enter the 4 sides:");
		double a= input.nextDouble();
		double b= input.nextDouble();
		double c= input.nextDouble();
		double d= input.nextDouble();
		System.out.println("Result to the perimeter of 4 sides : "+(a+b+c+d)+"cm");
	}

}
