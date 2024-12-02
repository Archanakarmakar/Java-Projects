package study;

import java.util.Scanner;

public class MonthSwitchMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to Month Swith mapping: ");
		System.out.print("Enter your month");
		int month= input.nextInt();
		String result = getMonthName(month);
		System.out.println("Welcome to current month: "+result);
	}
  
	public static String getMonthName(int monthnum)	{
		return switch(monthnum)				{
				case 1 -> "January";
				case 2 -> "Febuary";
				case 3 -> "March";
				case 4 -> "April";
				case 5 -> "May";
				case 6 -> "June";
				case 7 -> "July";
				case 8 -> "August";
				case 9 -> "September";
				case 10 -> "October";
				case 11 -> "November";
				case 12 -> "December";
				default ->" Mars month" ;
		};
		}
        }

