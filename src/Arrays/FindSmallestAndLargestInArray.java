package Arrays;

public class FindSmallestAndLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {32,43,53,54,98,32,65,63,1,43,23};
		
		printSmallestLargest(numbers);

	}

	private static void printSmallestLargest(int[] numbers) {
		// TODO Auto-generated method stub
		
		int smallest = numbers[0];
		int largest = numbers[0];
		
		for ( int j = 0; j < numbers.length; j++)
		{
			
			if(numbers[j] > largest)
			{
				largest = numbers[j];
			}
			else if ( numbers[j] < smallest)
			{
				smallest = numbers[j];
			}
			
		}
		
		System.out.println(" smallest is : " + smallest);
		System.out.println(" largest is : " + largest);
		
	}

}
