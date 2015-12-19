package Arrays;

public class HowManyTimesSortedArrayIsRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 6, 1, 2, 3, 4};
		
		int count = countOfRotation(arr);
		
		System.out.println("Array Rotated : " + count + "");
		
	}

	private static int countOfRotation(int[] arr) {
		// TODO Auto-generated method stub
		
		int low = 0 ; 
		int high = arr.length - 1 ;
		int count = Integer.MIN_VALUE ;
		int N = arr.length;
		int mid = 0 ;
		int next = 0 ;
		int prev = 0;
		while ( low <= high)
		{
			if(arr[low] < arr[high])
			{
				count = low;
				return count;
			}
			mid = low + (high - low)/2;
			next = (mid+1) % N;
			prev = (mid + N - 1) % N ;
			
			if(arr[mid] < arr[next] && arr[mid] < arr[prev])
			{
				count = mid;
				return count;
			}
			else if (arr[mid] <= arr[high])
			{
				high = mid-1;
			}
			else if ( arr[low] <= arr[mid])
			{
				low = mid + 1;
			}
			
		}
		
		return count;
	}

}
