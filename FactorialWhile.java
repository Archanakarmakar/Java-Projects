package study;

import java.util.Scanner;

public class FactorialWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner= new Scanner(System.in);
	     System.out.println("Welcome to the Factorial..... ");
	     System.out.println("Please enter the number....");
	     long num = scanner.nextLong();
	     long fact = printFactorial(num);
	     System.out.println("factorial no till: "+num+"  factorial no are:  "+fact);
	          	}

		public static long printFactorial(long num)
		{
		long fact=1;
		if(num < 2) {
			return 1;
		}
		int i=2;
		 while(i<=num)
		  {
			fact=fact*i; 
		  	 i++;
		  }
			 return fact;
		}	  
	}


