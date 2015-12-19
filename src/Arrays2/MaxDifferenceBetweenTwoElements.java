package Arrays2;

public class MaxDifferenceBetweenTwoElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2, 3, 10, 6, 4, 8, 1};
		int[] arr2 = {7, 9, 5, 6, 3, 2};
		
		int maxDiff = maxDifference(arr2);
		System.out.println("Max Difference: "+ maxDiff); 

	}

	private static int maxDifference(int[] arr) {
		// TODO Auto-generated method stub
		int maxDiff = arr[1] - arr[0];
		int minElement = arr[0];
		
		for(int i = 1 ; i < arr.length; i++)
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
