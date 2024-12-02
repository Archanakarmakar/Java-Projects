package study;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to ArrayReverse family...  ");
	     int[] numArr =ArrayUtility.inputArray();
	     reverseArray(numArr);
         System.out.println(" Your ReverseArray family...  ");
         ArrayUtility.displayArray(numArr);
	}
    public static void reverseArray(int[] numArr){
    	int i=0;
    	while(i<numArr.length/2) {
    		int swap = numArr[i];
    		numArr[i]= numArr[(numArr.length-1)-i];
    		numArr[(numArr.length-1)-i]=swap;
    		i++;
    		    	}
    	}
    	  	
    }

