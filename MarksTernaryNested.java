package study;

import java.util.Scanner;

public class MarksTernaryNested {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to Marks ternary no: ");
		System.out.print("Enter your marks");
		int marks= input.nextInt();
		String result= ((marks>80)? "High": ((marks>50)? "Moderate" :"Low"));
		System.out.println("Welcome to Final Marks result: "+ result);
	}
}
