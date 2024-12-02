package study;

import java.util.Scanner;

public class PercentageIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to Grades of marks:: ");
		System.out.println("Enter the marks on percentage:");
		int percentage = input.nextInt();
				
		if(percentage >= 90)
		{
		System.out.println("Great!.You have got grade A marks");
		}
		else if(percentage >= 75)
		{
		System.out.println("Good!.You have got grade B marks");
		}
		else if(percentage >= 60)
		{
		System.out.println("Work Hard next time!.You have got grade C marks");
		}
		else if(percentage >= 30)
		{
		System.out.println(" Seriously Work Hard!.You have got grade D marks");
		}
		else
		System.out.println("Sorry,you have got failed.");
	
		}
}
	



