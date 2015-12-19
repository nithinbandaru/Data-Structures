package Arrays2;

public class FindContiguousSequenceWithLargestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,3,-8,-1,2,4,-2,3};
		
		printContiguousSequence(arr);

	}

	private static void printContiguousSequence(int[] arr) {
		// TODO Auto-generated method stub
		
		String sequence = "";
		int sum = 0;
		int maxSum = 0;
		
		for(int i = 0; i<arr.length ; i++ )
		{
			sum = sum + arr[i];
			sequence = sequence + arr[i] + " -> ";
			if( sum > maxSum)
			{
				maxSum = sum;				
			}
			else if (sum < 0)
			{
			   sum = 0;
			   sequence = "";
			}
			//System.out.println("Sum: "+ sum + " Max Sum: "+ maxSum + " Sequence: "+ sequence);
		}
		
		System.out.println("Max Sum: "+ maxSum + " Sequence: "+ sequence);
	}

}
