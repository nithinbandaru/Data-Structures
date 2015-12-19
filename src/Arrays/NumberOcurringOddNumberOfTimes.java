package Arrays;

public class NumberOcurringOddNumberOfTimes {

	// Time  = O(n)
    // Space = O(1)
		
	public static void main(String[] args) {
		
		int arr[] = {2, 3, 5, 4, 5, 2, 4, 3, 5 , 2, 4, 4, 2};
		
		int oddNumber = getOddOccurence(arr);

		System.out.println(oddNumber + " occurs od number of times");
		
	}

	// Please note that XOR of two elements is 0 if both elements are same 
    // and XOR of a number x with 0 is x.
	private static int getOddOccurence(int[] arr) {
		
		int result = 0;
		for(int i = 0; i < arr.length ; i++)
		{
			result = result ^ arr[i] ;
		}
		
		return result;
	}

}
