package Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 4, 5, 6};
		
		int missingNumber = getMissingNumber(arr);
		System.out.println("Missing Number: " + missingNumber);

	}

	private static int getMissingNumber(int[] arr) {
		
		int xor1 = 0;
		
		int xor2 = 0;
		
		for(int i = 0 ; i<arr.length ;i++)
		{
			xor1 = xor1 ^ arr[i];
		}
		
		for(int i = 1 ; i <= arr.length + 1 ;i++)
		{
			xor2 = xor2 ^ i;
		}		
		
		return (xor1 ^ xor2);
	}

}
