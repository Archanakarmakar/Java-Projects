package study;

import java.util.Scanner;

public class MInimumTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to odd/Even no with ternary operator: ");
		System.out.print("Enter the first no");
		int num1= input.nextInt();
		System.out.print("Enter the second no");
		int num2= input.nextInt();
		MInimumTernary minT =new MInimumTernary();
		int MT= minT.min(num1,num2);
		System.out.println("Minimum nos:"+MT); 
	}

	public int min(int num1,int num2)
	{
	if(num1<num2)
	{
		return num1;
	}
	else {
		return num2;
	}
	}
}
