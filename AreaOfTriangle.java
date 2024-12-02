package study;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to the Area of triangle sides : ");
		System.out.println("Enter the base and height sides:");
		double b= input.nextDouble();
		double h= input.nextDouble();
		double A= (b*h)/2;
		System.out.println("Result of Area of triangle are : "+A+"cm2");
	}

}
