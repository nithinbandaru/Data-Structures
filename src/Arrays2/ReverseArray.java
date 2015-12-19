package Arrays2;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 1, 2, 3, 4, 5};
		
		printArray(arr);
		
		reverseArray(arr);
		System.out.println();
		
		printArray(arr);

	}

	private static void reverseArray(int[] arr) {
		// TODO Auto-generated method stub
		int temp ; 
		int start = 0; 
		int end = arr.length -1 ;
		while(start < end)
		{
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
