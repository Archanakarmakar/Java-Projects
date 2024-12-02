package study;

import java.util.Scanner;

public class SwappingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to Swapping nos : ");
		System.out.println("Enter the 2 nos:");
		double a= input.nextDouble();
		double b= input.nextDouble();
		 double c= a;
		 a=b;
		 b=c;
		 
		 System.out.println("Swapping results A and B:"+a+"         "+b);
	}

}
