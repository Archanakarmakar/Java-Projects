package study;

import java.util.Scanner;

public class OddEvenSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to odd and even no: ");
		System.out.println("Enter the number:");
		int num = input.nextInt();
		if(num%2==0) {
			System.out.println("Even no...");
			}else
			{
				System.out.println("Odd no...");
			}
	}

}
