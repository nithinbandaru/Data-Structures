package Arrays2;
import java.util.Arrays;


public class TripletForGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 4, 45, 6, 10, 8};
	    int sum = 22;
	    Arrays.sort(arr);

	    findTriplets( arr , sum);

	}

	private static void findTriplets(int[] arr, int sum) {
		// TODO Auto-generated method stub
		
		
		int left , right ;
		
		for(int i = 0 ; i < arr.length - 2 ; i++)
		{
			
			left = i + 1;
			right = arr.length - 1;
			while(left < right)
			{
				//System.out.println("Triplets: "+ arr[i] +" " + arr[left] +" "+ arr[right]);
				if(arr[i] + arr[left] + arr[right] == sum)
				{
					System.out.println("Triplets: "+ arr[i] +" " + arr[left] +" "+ arr[right]);
					return;
				}
				else if ( arr[i] + arr[left] + arr[right] < sum)
				{
					left++;
				}
				else
				{
					right--;
				}
			
				
			}
				
		}
		
		
		
	}

}
