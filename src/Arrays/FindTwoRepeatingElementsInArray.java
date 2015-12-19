package Arrays;

public class FindTwoRepeatingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 3, 1, 3, 6, 6};
		
		int arr2[] = {4, 2, 4, 5, 2, 3, 1};
		
		printRepeatElements(arr2);

	}

	private static void printRepeatElements(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[Math.abs(arr[i])] > 0)
			{
				arr[Math.abs(arr[i])] = - arr[Math.abs(arr[i])];
			}
			else
			{
				System.out.println(Math.abs(arr[i]) + " is repeating ");
			}
			
		}
		
		for(int i =0 ; i< arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}

}
