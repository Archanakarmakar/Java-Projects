package study;

import java.util.Scanner;

public class WhilePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("Welcome to the while Prime no.... ");
	     System.out.println("Please enter the number....");
	     int num = scanner.nextInt();
	     boolean isprime= IsPrime(num);
	     if(isprime)
	     {
	     System.out.println("your no is prime");
	     }
	     else 
	     {
	    	 System.out.println("your no is  not prime");
	}
	}
		public static boolean IsPrime(int num)
		{
			int i=2;
			while(i<num) {
				if(num%i==0)
				{
					return false;
				}
				i++;
			}
				 return true;
				}
			
		}
	
		

	


