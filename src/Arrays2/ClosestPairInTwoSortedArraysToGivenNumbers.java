package Arrays2;

public class ClosestPairInTwoSortedArraysToGivenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 4, 5, 7};
        int arr2[] = {10, 20, 30, 40};
        int x = 32;
        //System.out.println(Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
    	
        printClosestPair(arr1,arr2,x);

	}

	private static void printClosestPair(int[] arr1, int[] arr2, int value) {
		// TODO Auto-generated method stub
		int diff = Integer.MAX_VALUE;
		//System.out.println(Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
		int i = 0;
		int j = arr2.length-1;
		int arr1_index = -1;
		int arr2_index = -1;
		while(i< arr1.length && j>=0)
		{
			if(arr1[i]+arr1[j] - value < diff)
			{
				diff = arr1[i]+arr1[j] - value;
				arr1_index = i;
				arr2_index = j;
			}
			
			
		}
		
		
	}

}
