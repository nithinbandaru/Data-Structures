package Arrays;

public class MaximumSumSubSequenceNonAdjacent {

	public static void main(String[] args) {

		int arr[] = {5,  5, 10, 40, 50, 35};
		
		int maxSum = nonAdjacentSum(arr);
		
		System.out.println("Maxsum : " + maxSum);
		
	}

	private static int nonAdjacentSum(int[] arr) {

		int incl = arr[0];
		int excl = 0;		
		
		for(int i = 1; i < arr.length ; i++)
		{
			int temp = incl ;			
			incl = Math.max(excl + arr[i], incl);			
			excl = temp;
			
		}
		
		return incl;
	}

}
