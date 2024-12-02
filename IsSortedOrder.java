package study;

public class IsSortedOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Welcome to Array sorted checkin/out");
		int[] numArrary= ArrayUtility.inputArray();
		boolean isInc= IsIncreasing(numArrary);
		boolean isDec= IsDecreasing(numArrary);
		if(isInc || isDec) {
			System.out.println("Your Array is sorted...");
				}
		    else{
				System.out.println("your Array is not sorted...");
			    }
		    }
	
    public static boolean IsIncreasing(int[] numArray) {
    	int i=1;
    	while( i < numArray.length) {
    		if(numArray[i] < numArray[i-1]) {
    			return false;
    	}
    	i++;
        }
        return true;
        }
    
    public static boolean IsDecreasing(int[] numArray) {
    	int i=1;
    	while(i < numArray.length) {
    		if(numArray[i]>numArray[i-1]) {
    			return false;
    	     }
    		i++;
          }
        return true;
    }
}