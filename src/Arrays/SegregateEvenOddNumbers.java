package Arrays;


public class SegregateEvenOddNumbers {

	public static void main(String[] args) {
		
		int[] arr =  {12, 5, 34, 45, 9, 8, 90, 3};
		
		printArray(arr);
		
		SwapEvenOdd(arr);
		
		printArray(arr);
	}

	private static void SwapEvenOdd(int[] arr) {

		
		int left = 0; int right = arr.length - 1 ;
		
		while(left < right)
		{
			while(arr[left] % 2 == 0)
			{
				left++;
			}
			while(arr[right] % 2 != 0)
			{
				right--;
			}
			
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;	
			left++;
			right--;
			
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
