package Arrays;

public class RotationCountSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {  3, 4, 5, 1, 2 };
		
		int count = findRotationCount(arr);

		System.out.println("Array Rotated " + count + " times");
		
	}

	private static int findRotationCount(int[] arr) {
		// TODO Auto-generated method stub
		
		int n = arr.length;
		int low = 0 ;
		int high = n-1;
		
		while(low < high)
		{
			
			if(arr[low] < arr[high])
			{
				return low;
			}
			
			int mid = low + (high - low ) / 2 ;
			int next = ( mid+1 ) % n ;
			int prev = ( mid+n-1)% n ;
			
			if(arr[mid] <= arr[next] && arr[mid] <= arr[prev])
			{
				return arr[mid];
			}
			
			if(arr[mid] <= arr[high])
			{
				high = mid - 1;
			}
			else if ( arr[low] <= arr[mid])
			{
				low = mid + 1;
			}
		}
		
		return -1;
	}

}
