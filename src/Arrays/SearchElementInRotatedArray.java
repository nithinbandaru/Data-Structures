package Arrays;

public class SearchElementInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 12, 14 , 18 , 21 , 3, 6, 8, 9 } ;
		
		int index = findElement( arr , 18 );
		System.out.println(" Element found at index " + index);
		

	}

	private static int findElement(int[] arr, int key) {
		// TODO Auto-generated method stub
	
		int low = 0 ;
		int high = arr.length - 1;
		
		while(low <= high)
		{
			int mid = low + (high - low )/ 2;
			if(arr[mid] == key)
			{
				return mid;
			}
			// right half is sorted
			if(arr[mid] <= arr[high])
			{
				if( key > arr[mid] && key <= arr[high])
				{
					low = mid + 1;
				}
				else
				{
					high = mid - 1;
				}
			}
			else  // left half is sorted
			{
				if(key >= arr[low] && key < arr[mid])
				{
					high = mid - 1;
				}
				else
				{
					low = mid + 1;
				}	
			}
		}
		
		return -1;
	}

}
