package study;

import java.util.Scanner;

public class FibonacciSeriesWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("Welcome to the .... ");
	     System.out.println("Please enter the number....");
	     int num = scanner.nextInt();
	     int FiboNum= FibonacciNum(num);
	    System.out.print(" Fibo series are:  "+FiboNum);
	     
	     
	}
   public static int FibonacciNum(int num)
      {   
	    if(num < 0) return num;
   	  System.out.println("0"); 	
      if(num==0) return num;
      System.out.println("1"); 	  
      int first=0,second=1; 
	   while(first+second <num)
	   {
		int third= first+second;
		 System.out.print("Fibo series are: "+third+"  " ); 
		first=second;
		second= third;
		   	   }
		   return num; 
   }
}
