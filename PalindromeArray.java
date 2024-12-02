package study;

import java.util.Scanner;

public class PalindromeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Welcome to palindrome Array");
		int[] Arr= ArrayUtility.inputArray();
		boolean ispaln=isPalindrome(Arr);
		if(ispaln) {
			System.out.println("your array is palindrome");
		}
			else
			{
				System.out.println("your array is not palindrome");	
			}
		}
		

	
   public static boolean isPalindrome(int[] numArr) {
	   int i=0;
	   while(i<numArr.length/2)
	   {
		   if(numArr[i]!=numArr[numArr.length-1-i])
				   {
			      return false;
				   }
		         i++;
				   } return true;
	   }
   }

