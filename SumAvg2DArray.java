package study;

public class SumAvg2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Welcome to sum and Avg Array");
		int[][] numArr= ArrayUtility.inputArray2();
		long sum = sum2d(numArr);
		double Avg= Avg2d(numArr);
		System.out.print("the sum of 2d Array..."+sum);
		System.out.print("the AVG of 2d Array..."+Avg);
		
	}
    public static long sum2d(int[][] numArr) {
    	long sum=0;
    	int i=0;
    	while(i<numArr.length)
    	{
    		int j=0;
    		while(j<numArr[i].length) {
    			sum+= numArr[i][j];
    			j++;
    		}i++;
    		} return sum;
    }
    public static double Avg2d(int[][] numArr) {
    	if(numArr.length==0) {
    		return 0;
    	}
    	int rows= numArr.length;
    	int cols=numArr[0].length;
    	double size= rows*cols;
    	return sum2d(numArr)/size;
    
    }
}
