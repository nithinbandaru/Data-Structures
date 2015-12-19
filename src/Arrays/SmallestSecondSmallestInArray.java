package Arrays;

public class SmallestSecondSmallestInArray {

	public static void main(String[] args) {

		int arr[] = {12, 13, 1, 10, 34, 1};
		
		print2Smallest(arr);
	}

	private static void print2Smallest(int[] arr) {

		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] < first)
			{
				second = first;
				first = arr[i];				
			}
		    if( arr[i] > first && arr[i] < second)
			{
				second = arr[i];
			}
		}
		
		System.out.println(first + " -- " + second);
		
		
	}

}
