package study;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner= new Scanner(System.in);
     System.out.println("Welcome to the multipication table....... ");
     System.out.println("Please enter the number....");
     int num = scanner.nextInt();
     
     printmultiplicationtable(num);
          	}

	public static void  printmultiplicationtable(int num)
	{
		int i=1;
	  while(i<=10)
	  {
		  System.out.println(num+" X "+i+" = " +(num*i));
		  i++;
	  }
	}
	
}
