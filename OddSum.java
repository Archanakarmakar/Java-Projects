package study;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner= new Scanner(System.in);
	     System.out.println("Welcome to the Odd summation...... ");
	     System.out.println("Please enter the number....");
	     int num = scanner.nextInt();
	     int sum = printOddSum(num);
	     System.out.println("sumofoddnum till: "+num+"  Sum:  "+sum);
	          	}

		public static int printOddSum(int num)
		{
		int sum=0;
		int i=1;
		 while(i<=num)
		  {
			sum=sum+i; 
		  	 i+=2;
		  }
			 return sum;
			  
	}

}


