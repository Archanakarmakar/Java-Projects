package study;

import java.util.Scanner;

public class OccuranceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Array occurance");
		int[] numArray = ArrayUtility.inputArray();
		 System.out.println("now enter the no you want to find: ");
		 int num = input.nextInt(); 
		 int occurance = noOfOccurance(numArray,num);
		 System.out.println("Your element was found:"+occurance+" times ");
}
       public static int noOfOccurance(int[] numArray,int num) {
	    int ocur=0;
	    int i=0;
		while(i < numArray.length) {
		 if(numArray[i]==num) {
			 ocur++;
	      }
	     i++;
	      }
	      return ocur;
          }
}
