package study;

import java.util.Scanner;

public class Arthematic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to the calculator with simple calculation: ");
		System.out.print("Enter the first no:");
		int num1= input.nextInt();
		System.out.println("Enter the second no:");
		int num2= input.nextInt();
		
		int add= num1+num2;
		int sub= num1-num2;
		int mul= num1*num2;
		int div= num1/num2;
		int mod= num1%num2;
		System.out.println(" The Arithematic :"+add);
		System.out.println(" The Substraction :"+sub);
		System.out.println(" The Multipication :"+mul);
		System.out.println(" The Division :"+div);
		System.out.println(" The Modulas :"+mod);
		
	}

}
