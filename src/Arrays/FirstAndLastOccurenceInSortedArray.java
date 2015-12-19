package Arrays;

public class FirstAndLastOccurenceInSortedArray {

	public static void main(String[] args) {

		
		int[] arr = { 2 , 4 , 10 , 10 , 10 , 18 , 20 };
		
		int firstOccurence = binarySearchFirst(arr , 10, true);
		int lastOccurence = binarySearchFirst(arr , 10, false);
		
		System.out.println(firstOccurence + " " + lastOccurence);
		
	}

	private static int binarySearchFirst(int[] arr, int key, boolean searchFirst) {

		int low = 0 ; int high = arr.length - 1 ;
		
		int index = -1;
		
		while(low <= high)
		{
			int mid = ( low + high )/2;
			
			if(key == arr[mid])
			{
				index = mid;
				if(searchFirst)
				{
					high = mid - 1;
				}
				else
				{
					low = mid + 1;
				}
			}
			else if(key < arr[mid])
			{
				high = mid - 1;
			}
			else
			{
				low = mid + 1;
			}
		}
		
		return index;
	}

}
