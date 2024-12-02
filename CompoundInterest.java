package study;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to the Compound interest : ");
		System.out.println("Enter the principle in RS\n:");
		int P= input.nextInt();
		System.out.println("Enter the Rate:");
		Float R= input.nextFloat();
		System.out.println("tell me ,how many years borrow this money:");
		Float T= input.nextFloat();
		double compInter= P*Math.pow((1+R/100), T);
		
		System.out.println("Result to the Compound interest : "+compInter+" "+"RS");
	}

}
