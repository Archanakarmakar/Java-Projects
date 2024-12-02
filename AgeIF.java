package study;

import java.util.Scanner;

public class AgeIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to catogaries of person age:: ");
		System.out.println("Enter the person's age:");
		int Age = input.nextInt();
				
		if(Age >= 65)
		{
		System.out.println("Great!.You are  senior citizen");
		}
		else if(Age >=20)
		{
		System.out.println("Good!.You are Adult person");
		}
		else if(Age>=13)
		{
		System.out.println("You are Teen person");
		}
		else
		System.out.println("You are child.");
	
	}

}
