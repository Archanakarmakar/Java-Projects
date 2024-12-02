package study;

import java.util.Scanner;

public class LeapyearIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to leap year with If else condition: ");
		System.out.println("Enter the year for leap year:");
		int year = input.nextInt();
		
		if((year%400==0) ||(year%4==0 && year%100!=0 ))
		{
			System.out.println("your year is leap year..."+year);
			
		}else
		{
			System.out.println("your year is not leap year"+year);
		}
	}

}
