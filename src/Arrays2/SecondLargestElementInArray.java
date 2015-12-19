package Arrays2;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 6, 34, 2, 4, 8, 34, 76, 2, 3, 34, 34, 9, 2, 1};
		printSecondMax(arr);
	}

	private static void printSecondMax(int[] arr) {
		// TODO Auto-generated method stub
		
		int firstmax = 0;
		int secondmax = 0;
		if(arr[0]<arr[1])
		{
			firstmax = arr[1];
			secondmax = arr[0];
		}
		else
		{
			firstmax = arr[0];
			secondmax = arr[1];			
		}	
		for(int i = 2 ; i<arr.length ;i++)
		{
			if(arr[i]>firstmax)
			{
				secondmax = firstmax;
				firstmax = arr[i];
			}
			else if (arr[i] > secondmax && arr[i]<firstmax)
			{
				secondmax = arr[i];
			}
		}
		
		System.out.println("Firstmax: "+ firstmax + " SecondMax: "+ secondmax);
	}
	

}
