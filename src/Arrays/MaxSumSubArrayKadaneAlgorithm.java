package Arrays;

public class MaxSumSubArrayKadaneAlgorithm {

	public static void main(String[] args) {
		
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		int maxSum = maxSumSubArray(arr);
		System.out.println(maxSum);
		
		int maxSum2 = maxSumSubArrayWithIndex(arr);
		System.out.println(maxSum2);
		

	}

	private static int maxSumSubArrayWithIndex(int[] arr) {

		int maxSum = arr[0] ; int sumSoFar = arr[0];
		int start = 0 ; 
		int end = 0;
		int changeIndex = 0;
		
		for( int i = 0 ; i < arr.length ; i++)
		{
			if( sumSoFar >= 0)
			{
				sumSoFar = sumSoFar + arr[i];
				
			}
			else
			{
				sumSoFar = arr[i];	
				changeIndex = i;
			}
			if(sumSoFar > maxSum)
			{
				maxSum = sumSoFar;
				start  = changeIndex;
				end    = i;
			}
		}
		for(int i = start ; i <= end; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		return maxSum;		
	}

	private static int maxSumSubArray(int[] arr) {
		
		
		int maxSum = 0 ; int sumSoFar = 0;
		
		for( int i = 0 ; i < arr.length ; i++)
		{
			if( sumSoFar + arr[i] > 0)
			{
				sumSoFar = sumSoFar + arr[i];
				
			}
			else
			{
				sumSoFar = 0;			
			}
			maxSum = (maxSum > sumSoFar ? maxSum : sumSoFar);
		}
		
		return maxSum;
		
	}

}
