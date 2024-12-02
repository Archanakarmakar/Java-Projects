package study;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to the Simple interest : ");
		System.out.println("Enter the principle in RS\n:");
		int P= input.nextInt();
		System.out.println("Enter the Rate:");
		Float R= input.nextFloat();
		System.out.println("tell me ,how many years borrow this money:");
		Float T= input.nextFloat();
		
		Float SI =(P*R*T)/100;
		
		System.out.println("Final SI:\n"+SI+" "+"RS");
		
	}

}
