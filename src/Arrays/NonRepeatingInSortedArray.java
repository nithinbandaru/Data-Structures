package Arrays;
import java.util.HashSet;


public class NonRepeatingInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 2, 2 , 3,3};

		int nonRepeatElement = findNonRepeatElement(arr);
		System.out.println(nonRepeatElement);
		
	}

	private static int findNonRepeatElement(int[] arr) {
		
		if(arr == null || arr.length == 0)
		{
			return Integer.MIN_VALUE;
		}
		if(arr.length == 1)
		{
			return arr[0];
		}
		
		for ( int i = 0 ; i < arr.length ; i++)
		{			
			if(i==0 && arr[i] != arr[i+1] )
			{	
				return arr[i];				
			}
			else  if ( i > 0 && i < arr.length - 1 && arr[i] != arr[i-1] && arr[i] != arr[i+1])
			{	
				return arr[i];				
			}
			else if ( i == arr.length - 1 && arr[i] != arr[i-1])
			{				
					return arr[i];
			}			
		}		
		
	    return Integer.MIN_VALUE;
	}

}
