package study;

public class ArraySumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Welcome to Array Sum and Average");
     int[] numArray=ArrayUtility.inputArray();
     long sum= ArraySum(numArray);
     double Avg=ArrayAverage(numArray);
     System.out.println("Welcome to Array Sum and Average....sum"+sum+"Avg :"+Avg+" ");
	}
  public static long ArraySum(int[] numArray)
    {
	  long sum=0;
	  int i=0;
	  while(i<numArray.length) {
		sum =sum+numArray[i];
		i++;
        }
	  return sum;
     }

  public static double ArrayAverage(int[] numArray) {
	  long sum= ArraySum(numArray);
	 return (double) (sum/numArray.length); 
  }
}
