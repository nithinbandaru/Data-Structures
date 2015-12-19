package Arrays;

public class IncreasingDecreasingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5, 3 , 2 };
		
		findPivot(arr);
		
		findPivotBinarySearch(arr, 0 , arr.length);
	}

	private static void findPivotBinarySearch(int[] arr , int low , int high) {
		// TODO Auto-generated method stub
				
		int mid = low + (high - low )/2;
		
		if(arr[low] < arr[mid])
		{
			findPivotBinarySearch(arr, mid+1 , high);
		}
		
	}

	private static void findPivot(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i < arr.length-1 ; i++)
		{
			if(arr[i] > arr[i+1])
			{
				System.out.println(arr[i]);
				return;
			}
		}
		
	}

}
