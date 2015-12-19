package SinglyLinkedLists;

public class FloorAndCeiling {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 6, 8, 10, 12, 19};
		
		printArray(arr);
		
		int ceil = CeilOfNumber(arr, 0, arr.length - 1,  19);
		System.out.println("Ceil : " + ceil);
		
		int floor = FloorOfNumber(arr, 0, arr.length - 1,  11);
		System.out.println("floor : " + floor);
		

	}

	private static int FloorOfNumber(int[] arr, int low, int high, int key) {

		if(key < arr[low])
		{
			return -1;
		}
		
		if(key > arr[high])
		{
			return arr[high];
		}
		
		int mid = ( low + high ) / 2 ;
		
		if(key == arr[mid])
		{
			return arr[mid];
		}
		else if (key > arr[mid])
		{
			if(key < arr[mid+1] && mid + 1 <= high)
			{
				return arr[mid];
			}
			else
			{
				return FloorOfNumber( arr, mid + 1 , high,  key);
			}
		}
		else
		{
			if(key > arr[mid-1] && low <= mid - 1)
			{
				return arr[mid-1];
			}
			else
			{
				return FloorOfNumber( arr, low , mid - 1,  key);
			}
		}
		
	}

	private static int CeilOfNumber(int[] arr, int low , int high , int key) {

		
		if( key <= arr[low])
		{
			return arr[low];
		}
		
		if(key > arr[high])
		{
			return -1;
		}
		
		int mid = (low + high)/2 ;
		
		if(key == arr[mid])
		{
			return arr[mid];
		}
		else if (key > arr[mid])
		{
			if(key < arr[mid+1] && mid + 1 <= high)
			{
				return arr[mid+1];
			}
			else
			{
				return CeilOfNumber(arr, mid +1  , high , key );
			}
		}
		else
		{
			if(key > arr[mid - 1] && low <= mid - 1)
			{
				return arr[mid];
			}
			else
			{
				return CeilOfNumber(arr, low  , mid - 1 , key );
			}
			
		}		
	}

	private static void printArray(int[] arr) {
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	
	
	
}
