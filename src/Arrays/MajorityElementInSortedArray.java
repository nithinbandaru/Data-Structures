package Arrays;

public class MajorityElementInSortedArray {

	public static void main(String[] args) {

		int arr[] = {1, 2, 3, 3, 3, 3, 10};
		
		boolean majorityElement = checkMajorityProperty(arr , 10);
		System.out.println(majorityElement);
		
	}

	private static boolean checkMajorityProperty(int[] arr, int key) {
		// TODO Auto-generated method stub
		
		int index = binarySearchFirst(arr, key, true);
		System.out.println(index);
		int n = arr.length;
		
		if(index == -1)
		{
			return false;
		}
		
		try {
			if(arr[index + n/2] == key &&  (index+ n/2 <= n-1))
			{
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
			
		}		
		return false;
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
