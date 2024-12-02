package study;
import java.util.Scanner;

public class ArrayUtility {
	
	public static int[] inputArray() {
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter the no of elements:");
		int size = input.nextInt();
		int[] nums = new int[size];
		int i=0;
		while(i< size) {
			System.out.println("Please enter the no of elements"+(i+1)+":");
			nums[i]= input.nextInt();
			i++;
		}
		return nums;
	}
	public static void displayArray(int[] numArray)
	{
		int i=0;
		while(i<numArray.length) {
			System.out.println(numArray[i]+" ");
			i++;
		}
		System.out.println();
	}
	public static int[][] inputArray2() {
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter the no of rows:");
		int rows  = input.nextInt();
		System.out.println("Please enter the no of columns:");
		int cols  = input.nextInt();
		int[][] numArray = new int[rows][cols];
		int i=0;
		while(i< rows) {
			int j=0;
			while(j<cols) {
			System.out.println("Please enter the no of elements rows"+(i+1)+":cols:"+(j+1)+" ");
			numArray[i][j]= input.nextInt();
			j++;
		   }
			i++;
		  }
		return numArray;
	}
}



