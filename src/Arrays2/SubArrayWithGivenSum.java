package Arrays2;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
	   
	    int sum = 23;
	    subArraySum(arr,sum);

	}

	private static void subArraySum(int[] arr, int sum) {
		// TODO Auto-generated method stub
		
		int currSum = 0 , start = 0;
		String subArray = "";
		
		for(int i = 0 ; i< arr.length ; i++)
		{
			while (currSum > sum && start < i-1)
	        {
				currSum = currSum - arr[start];
	            start++;
	        }
	 
	        // If curr_sum becomes equal to sum, then return true
	        if (currSum == sum)
	        {
	            System.out.println("Sum found between indexes  and "+ start +" and " + (i-1));
	            //return 1;
	        }
	 
	        // Add this element to curr_sum
	        if (i < arr.length)
	        	currSum = currSum + arr[i];

			
			
		}
		
	}

}
