package study;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
	     System.out.println("Welcome to the GCD...... ");
	     System.out.println("Please enter the 2  numbers....");
	     int num1 = scanner.nextInt();
	     int num2 = scanner.nextInt();
	     int Gcd = printGCD (num1,num2);
	     System.out.println(" GCD of 2 nos: "+num1+"   "+num2+" " +" GCD:  "+Gcd);
	          	}

	public static int printGCD(int num1,int num2)
	{
		int Gcd=1;
		int i=2;
		int least= least(num1,num2);
		while(i<=least) {
			if(num1%i==0 &&num2%i==0) {
				Gcd=i;
		}
		i++;
		} 
		return Gcd;
	}
	 public static int least(int num1,int num2) {
		 if(num1<num2)
			 return num2;
		 else
			 return num1;
	 			 	 }
		}


