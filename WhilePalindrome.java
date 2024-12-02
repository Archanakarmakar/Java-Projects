package study;

import java.util.Scanner;

public class WhilePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	     System.out.println("Welcome to the palindrom family.... ");
	     System.out.println("Please enter the number....");
	     int num = scanner.nextInt();
	     boolean palindromno= IsPalindromeno(num);
	     if(palindromno) 
	     System.out.println(" your no is palindrom no   "+ num);
	     else 
	     System.out.println(" your no is not palindrom no    "+  num);
	}
	  
	
	public static Boolean IsPalindromeno(int num)
	{
	int reverse = ReverseDigit(num); 
	return num==reverse;
	}
	public static int ReverseDigit(int num)
	{
		int newnum=0;
		while(num>0) {
		int digit=num%10;
		newnum = newnum*10+ digit;
		num=num/10;
			
	}
		return newnum;
	}
	}


