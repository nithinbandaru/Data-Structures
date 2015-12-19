package Arrays2;

public class FindMaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1000, 11, 445, 1, 330, 3000};
		
		int[] arr2 = { 2, 3, 4, 1 };
 		
		int[] min_max = getMaxMin(arr2);	
		
		System.out.println("Min Element: "+  min_max[0] + " Max Element: " + min_max[1]);
		

		
	}
	
	
	private static int[] getMaxMin(int[] arr) {
		// TODO Auto-generated method stub
		int[] min_max = new int[2];
		
		if(arr[0] < arr[1])
		{
			min_max[0] = arr[0];
			min_max[1] = arr[1];
		}
		else
		{
			min_max[0] = arr[1];
			min_max[1] = arr[0];
		}
		
		for(int i = 2 ; i < arr.length ; i++)
		{
			if(arr[i] < min_max[0])
			{
				min_max[0] = arr[i];
			}
			if(arr[i] > min_max[1])
			{
				min_max[1] = arr[i];
			}
		}
		
		
		
		
		return min_max;
	}


}
