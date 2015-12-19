package Arrays;

public class PrintArray {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6};
		
		printArray(arr);
		

	}

	private static void printArray(int[] arr) {
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	
	
	
}
