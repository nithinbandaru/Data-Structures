package Arrays;

public class PrintFirstSecondLargestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 13, 19, 10, 34, 1};
	    print2Largest(arr);

	}

	private static void print2Largest(int[] arr) {
		// TODO Auto-generated method stub
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for ( int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] > first)
			{
				second = first;
				first = arr[i];
			}
			else if ( arr[i] > second && arr[i] !=first)
			{
				second = arr[i];
			}
			
		}
		System.out.println("first largest : " + first + " second largest : " + second);
		
		
	}

}
