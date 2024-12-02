package study;

import java.util.Scanner;

public class LCMWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner= new Scanner(System.in);
	     System.out.println("Welcome to the LCM...... ");
	     System.out.println("Please enter the 2  numbers....");
	     int first = scanner.nextInt();
	     int second = scanner.nextInt();
	     int factor = printLCM (first,second);
	     System.out.println(" LCM of 2 nos: "+first+"   "+second+" " +" factor:  "+factor);
	          	}

		public static int  printLCM(int first,int second)
		{
		
		int i=1;
		 while(true)
		 {
		 int factor=first*i;
		 if (factor%second == 0)
		  {
			return factor;
	       }
           i++;
          }
		  }
         }
