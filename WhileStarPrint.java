package study;

import java.util.Scanner;

public class WhileStarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	     System.out.println("Welcome to the WhileStar print left side.... ");
	     System.out.println("Please enter the number....");
	    int rows = input.nextInt();
	    printLeftStarPrint(rows);
	    printReverseRightStarPrint(rows);
	    printleftStarPrint(rows);
	}
	public static void printLeftStarPrint(int maxRows) {
		System.out.println("Here is the left side star pattern");
		int rows=0;
		while(rows < maxRows){
			System.out.print("*");
			int i=0;
			while(i<rows)
			{
			System.out.print(" * ");
			i++;	
			}
			System.out.println();
			rows++;
		}
		}
	public static void printReverseRightStarPrint(int maxRows) {
		System.out.println("Here is the printReverseRightStarPrint star pattern");
		int rows = maxRows;
		while(rows>0)
		{
		System.out.print("*");
		rows--;
		int i = 0;
		while(i< rows) {
			System.out.print(" *");
		i++;
		}
		System.out.println();
	}
	}
	public static void printleftStarPrint(int maxRows) {
		System.out.println("Here is the printleftStarPrint star pattern");
		int rows=maxRows;
		while(rows>0) {
			int j=0;
			while(j<rows)
			{
			System.out.print(" ");
			j++;
			}
			int i=0;
			while(i<=(maxRows-rows)) {
				System.out.print(" *");
				i++;
			}
			System.out.println();
			rows--;
		}
		}
	}



