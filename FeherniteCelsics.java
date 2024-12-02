package study;

import java.util.Scanner;

public class FeherniteCelsics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to the fehernite temp to celcisc : ");
		System.out.println("Enter the Fehernite in RS\n:");
		float F= input.nextFloat();
		float C= (F-32)*5/9;
		
		System.out.println("Result the fehernite temp to celcisc is : "+C+""+"C");
	}

}
