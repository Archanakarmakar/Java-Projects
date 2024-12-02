package study;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to odd/Even no: ");
		System.out.print("Enter your no");
		int num= input.nextInt();
		String result= (num%2 == 0)? "Even":"Odd";
		System.out.println(" odd/Even no:" +result );
			}

	}
