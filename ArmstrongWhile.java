package study;

import java.util.Scanner;

public class ArmstrongWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("Welcome to the Armstrong  number.... ");
	     System.out.println("Please enter the number....");
	     int num = scanner.nextInt();
	     boolean isarmstrong= IsArmstrongNumber(num);
	     if(isarmstrong) {
	    	 System.out.println("your no is armstrong no....");}
	       else {
	    	 System.out.println("your no is not armstrong no....");
	}
	     
	}
     public static boolean IsArmstrongNumber(int num) {
    	 int noofdigits=noofdigits(num);
    	 int finalnumber = 0;
    	 while(num>0) {
    		 int lastdigit= num % 10;
    		 num /=10;
    		 finalnumber +=power(lastdigit,noofdigits) ;
    		 return finalnumber== num;
    		 
    		 
    	 }
    	 
    	 return false;
     }
     public static int power(int num1,int num2)
     {
    	 int result=1;
    	 int i=0;
    	 while(i<num2) {
    		 result*= num1;
    		 i++;
    	 }
    	 return result;
     }
     
     public static int noofdigits(int num)
     {
    	 int digits=0;
    	 while(num>0) {
    		 digits++;
    		 num=num/10;
    	 }
    return digits;
    	 }
    	 
     }
     

