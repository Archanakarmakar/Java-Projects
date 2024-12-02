package study;

import java.util.Scanner;

public class Search2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		System.out.println("Welcome to 2D Array");
		int[][] numArray= ArrayUtility.inputArray2();
		System.out.println("Now enter the number you want to search...");
		int num=input.nextInt();
		boolean isFound = search2DArray(numArray,num);
		if(isFound) {
			System.out.print("your number was found");
		}else
			{
				System.out.print("your number was not found");	
			}
		}
	
	public static boolean search2DArray(int[][] numArr,int num) {
		int i=0;
		while(i<numArr.length) {
			int j=0;
			while(j<numArr[i].length) {
				if(numArr[i][j]==num) {
					return true;
				}
				j++;
				}
			i++;
				}			
		return false;
	}

}
