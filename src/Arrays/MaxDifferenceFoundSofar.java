package Arrays;

public class MaxDifferenceFoundSofar {

	public static void main(String[] args) {

		int arr[] = {1, 2, 6, 80, 100};
		
		int maxDiff = maxDifference(arr);
		
		System.out.println(maxDiff);
		
		
	}

	private static int maxDifference(int[] arr) {

		int minElement = arr[0];
		
		int maxDiff = arr[1] - arr[0];
		
		for(int i = 1 ; i < arr.length ; i++)
		{
			if(arr[i] - minElement > maxDiff)
			{
				maxDiff = arr[i] - minElement;
			}
			
			if(arr[i] < minElement)
			{
				minElement = arr[i];
			}
			
		}
		
		return maxDiff;
	}

}
