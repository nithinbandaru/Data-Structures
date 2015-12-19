package Arrays;

public class ReverseSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5, 6};
		
		reverseArray(arr);
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

	private static void reverseArray(int[] arr) {
		// TODO Auto-generated method stub
		
		int temp = 0;
		int i = 0 ;
		int j = arr.length-1;
		while(i <= j)
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;j--;
		}		
	}

}
