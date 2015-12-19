package Arrays;

public class LargestPairSumUnsortedArray {

	public static void main(String[] args) {

		
		int arr[] = {12, 34, 10, 6, 40};
		
		int maxSum = largestPairSum(arr);
		
		System.out.println(maxSum);
		
	}

	private static int largestPairSum(int[] arr) {

		int firstMax = arr[0] > arr[1] ? arr[0] : arr[1];
		int secondMax = arr[0] < arr[1] ? arr[0] : arr[1];
		
		for(int i=2 ; i < arr.length ; i++)
		{
			if(arr[i] > firstMax)
			{
				secondMax = firstMax;
				firstMax = arr[i];				
			}
			else if(arr[i] > secondMax)
			{
				secondMax = arr[i];
			}
			
		}		
		
		return (firstMax + secondMax);
	}

}
