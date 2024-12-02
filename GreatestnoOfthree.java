package study;

import java.util.Scanner;

public class GreatestnoOfthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to Greatest of three nos ");
		System.out.println("Enter the 1st number:");
		int num1= input.nextInt();
		System.out.println("Enter the 2nd number:");
		int num2= input.nextInt();
		System.out.println("Enter the 3rd number:");
		int num3= input.nextInt();
		
		if(num1>=num2 && num1>=num3)
		{
			System.out.println("num1 is the greatest nos...."+num1);
		}else if(num2>=num3)
		{
		System.out.println("num 2is the greatest nos...."+num2);
		}else
		{
			System.out.println("num3 is the greatest nos...."+num3);
		}
	}

}
