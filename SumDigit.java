package study;

import java.util.Scanner;

public class SumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("Welcome to the Sum of digits.... ");
	     System.out.println("Please enter the number....");
	     int num = scanner.nextInt();
	     int sum = printSumDigit(num);
	     System.out.println("Sum of digits till: "+num+"  Sum of digits are:  "+sum);
	          	}

		public static int printSumDigit(int num)
		{
			int sum=0;
			while(num>0)
			{
				sum+=num%10;
				num=num/10;
			}			
			 return sum;
    	}

}
