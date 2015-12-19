package General;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {11, 12, 13, 20, 34, 51, 63};
		
		int index = binarySearchIterative(arr, 11);
		System.out.println("Element found at index via Iterative method : " + index);
		
		index = binarySearchRecursive(arr , 0, arr.length-1 , 51);
		System.out.println("Element found at index via Recursive method : " + index);
		
	}

	private static int binarySearchRecursive(int[] arr, int low , int high, int findElement) {
		// TODO Auto-generated method stub
		
		if(low > high)
		{
			return -1;
		}
		int mid = low + (high - low)/2;
		
		if(arr[mid] == findElement)
		{
			return mid;
		}
		else if ( arr[mid] < findElement)
		{
			binarySearchRecursive(arr, mid + 1 , high, findElement);
		}
		else
		{
			binarySearchRecursive(arr, low , mid-1, findElement);
		}
		
		return -1;
	}

	private static int binarySearchIterative(int[] arr, int findElement) {
		// TODO Auto-generated method stub
		
		int low = 0 ;
		int high = arr.length - 1 ;
		int mid;
		while ( low <= high )
		{
			mid = low + (high - low)/2 ;
			if( arr[mid] == findElement )
			{
				return mid;
			}
			else if ( arr[mid] > findElement)
			{
				high = mid - 1;
			}
			else
			{
				low = mid + 1;
			}		
		}		
		
		return -1;
	}

}
