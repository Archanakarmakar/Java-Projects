package study;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Array to merge Array family...  ");
	     int[] numArr =ArrayUtility.inputArray();
	     int[] numArr1 =ArrayUtility.inputArray();
	    int[] merge = mergeArray(numArr,numArr1);
	    
	     System.out.print("Merge array...:");
	     ArrayUtility.displayArray(merge);
	}
   public static int[] mergeArray(int[] arr1,int[] arr2) {
	   int newSize= arr1.length+arr2.length;
	   int[] newArr = new int[newSize];
	   int i=0,j=0,k=0;
	   while(i<arr1.length||j<arr2.length)
	   {
		  if(j==arr2.length||
				  (i<arr1.length && arr1[i]<arr2[j])) {
		newArr[k]=arr1[i];
		i++;
		k++;
	   }
		  else
		  {
		newArr[k]=arr2[j];
		  k++;
		  j++;
	   }
	 	    }
	return newArr;
}
}