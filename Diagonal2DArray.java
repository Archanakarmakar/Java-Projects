package study;

public class Diagonal2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to sum of diagonal Array");
		int[][] numArr= ArrayUtility.inputArray2();
		long sumofDiagonal= sumOfDiagonal(numArr);
		System.out.print("sum of diagonal Array...."+sumofDiagonal);
			
	}
  public static long sumOfDiagonal(int[][] numArr) {
	  long leftsum=sumOfDiagonalleft(numArr);
	  long rightsum=sumOfDiagonalright(numArr);
	  long sum= leftsum+rightsum;
	  if(numArr.length%2!=0) {
		  int ind= numArr.length/2;
		   sum-=numArr[ind][ind];
	  }
	   
	  return sum;
  }
  public static long sumOfDiagonalleft(int[][] numArr) {
	  long sum=0;
	  int i=0;
	  while(i<numArr.length)
	  { sum+= numArr[i][i];
	  i++;
	  }
	  	  return sum;
      }
  public static long sumOfDiagonalright(int[][] numArr) {
	  long sum=0;
	  int i=0;
	  while(i<numArr.length) {
		 int cols=numArr.length-1-i;
		  sum+=numArr[i][cols];
		  i++;
	  }
	  return sum;
  }
  }

