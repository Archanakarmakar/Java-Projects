package study;

import java.util.Scanner;

public class DeleteFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Welcome to Array deletion\n");
		int[] numArray = ArrayUtility.inputArray();
		System.out.println("Which no you want to delete for Array");
		int numtodelete = input.nextInt();
		int[] newArr=deleteArraynum(numArray,numtodelete); 
		System.out.println("Here is your new Array");
		ArrayUtility.displayArray(newArr);
	}
    public static int[] deleteArraynum(int[] numArray,int numtodelete)
    {
    	int occ=OccuranceArray.noOfOccurance(numArray, numtodelete);
    	if(occ==0)
    	return numArray;
    	int newSize= numArray.length-occ;
    	int[] newArr= new int[newSize];
    	int i=0,j=0;
    	while(i<numArray.length) {
    		if(numArray[i]!=numtodelete) {
    			newArr[j]=numArray[i];
    			j++;
    		}
    		i++;
    	}return newArr;
    	
    }
}
