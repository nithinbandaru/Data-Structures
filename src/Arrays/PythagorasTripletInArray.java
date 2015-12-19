package Arrays;
import java.util.Arrays;


public class PythagorasTripletInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {3, 1, 4, 6, 5};
		int arr2[] = {10, 4, 6, 12, 5};
		printTriplet(arr2);
		
	}

	private static void printTriplet(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = arr[i]*arr[i];
		}
		
		Arrays.sort(arr);
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			//System.out.print(arr[i]+ " ");
		}
		
		for(int j = arr.length - 1 ; j >=2 ; j--)
		{
			
			int left = 0;
			int right = j-1;
			
			while(left < right)
			{
				if(arr[left] +  arr[right] == arr[j])
				{
					System.out.println(Math.sqrt(arr[left]) + " , " + Math.sqrt(arr[right]) + " , "  + Math.sqrt(arr[j]));
					return;
				}
				else if ( arr[left] +  arr[right] < arr[j] )
				{
					left++;
				}
				else
				{
					right--;
				}
			}
			
		}
		System.out.println("No pythagoras triplet");
	
	}

}
