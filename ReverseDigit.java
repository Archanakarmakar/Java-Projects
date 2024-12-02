package study;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("Welcome to the ReverseDigit.... ");
	     System.out.println("Please enter the number....");
	     int num = scanner.nextInt();
	     int reversedigit= ReverseDigit(num);
	     System.out.println("Reverse digits till: "+num+"  reserve of digits are:  "+reversedigit);
	     
	     
	}
	public static int ReverseDigit(int num)
	{
		int i;
		int newnum=0;
		while(num>0) {
		int digit=num%10;
		newnum = newnum*10+ digit;
		num=num/10;
			
	}
		return newnum;
	}

}
