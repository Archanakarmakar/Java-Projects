package study;

public class ArrayMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Array Maximum and minimum....:");
		int[] numArray= ArrayUtility.inputArray();
		int max= Max(numArray);
		int min= Min(numArray);
		System.out.println("Maximum no of element...:"+max);
		System.out.println("Minimum no of element...:"+min);
	}
      public static int Max(int[] numArray)
      {
    	  if(numArray.length == 0)
    		  return Integer.MIN_VALUE;
    	  int max = numArray[0];
    	  int i=1;
    	  while(i < numArray.length) {
    	   if(max<numArray[i]) {
    		   max=numArray[i];
    	   }
    	  i++;
      }
    	return max;  
      }
      public static int Min(int[] numArray)
      {
    	 int min= Integer.MAX_VALUE;
    	 int i=0;
    	 while(i<numArray.length) {
    		if(min>numArray[i]) {
			min = numArray[i];
			}
    		 i++;
    	 }
    	  return min;
      }
      
}
