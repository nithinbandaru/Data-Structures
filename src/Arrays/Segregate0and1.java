package Arrays;

public class Segregate0and1 {

	public static void main(String[] args) {
		
		int[] arr = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };

		printArray(arr);
		
		Segregate01(arr);
		
		printArray(arr);
	}

	private static void Segregate01(int[] arr) {

		
		int left = 0 ; int right = arr.length - 1;
		
		while(left < right)
		{
			
			while(arr[left] == 0)
			{
				left++;
			}
			while(arr[right] == 1)
			{
				right--;
			}
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;right--;
			
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
