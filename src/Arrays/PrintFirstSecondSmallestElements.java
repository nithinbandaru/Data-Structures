package Arrays;

public class PrintFirstSecondSmallestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 13, 1, 10, 34, 1};
	    print2Smallest(arr);

	}

	private static void print2Smallest(int[] arr) {
		// TODO Auto-generated method stub
		
		if(arr.length < 2 )
		{
			return ;
		}
		
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		for ( int i = 0 ; i<arr.length ; i++)
		{
			if(arr[i] < first)
			{
				
				second = first;
				first = arr[i];
			}
			else if ( arr[i] < second && first != arr[i])
			{
				second = arr[i];
			}			
			
		}
		
		System.out.println("first smallest : " + first + " second smallest : " + second);
	}

}
