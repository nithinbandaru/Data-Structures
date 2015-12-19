package Arrays2;
import java.util.Arrays;


public class MissingAndRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[] = {1,3,4,3};
		 
		 naiveMethod(arr);
		 
		 sophisticatedMethod(arr);
		 
		 	 
		 
	}

	private static void sophisticatedMethod(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i =0 ; i< arr.length ; i++)
		{
			if(arr[Math.abs(arr[i]) - 1] > 0 )
			{
				arr[Math.abs(arr[i]) - 1] = - arr[Math.abs(arr[i]) - 1];
			}
			else
			{
				System.out.println("Repeating element: " + Math.abs(arr[i]));
			}
		}
		
		for(int i =0 ; i< arr.length ; i++)
		{
			if(arr[i] > 0 )
			{
				System.out.println("Missing Element : " + (i+1));
			}
		}
	}

	private static void naiveMethod(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		 
		 int arrSum = 0;
		 for(int i: arr)
		 {
			 arrSum += i;
		 }
		 System.out.println("ArrySum: " + arrSum);
		 int n = arr.length;
		 System.out.println("n = "+n);
		 int origSum = (n * (n+1))/2;
		 System.out.println("Original Sum: " + origSum);
		 int repeatElement = 0;
		 for(int i = 0 ; i < arr.length-1 ; i++)
		 {
			 if(arr[i] == arr[i+1])
			 {
				 System.out.println("Repeat Element: " + arr[i]);
				 repeatElement = arr[i];
			 }
		 }
		int diff = arrSum - origSum;
		
		System.out.println("Missing Element: " + (repeatElement - diff));
	
		
	}	

}
