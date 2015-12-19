package Arrays;
import java.util.HashMap;
import java.util.Map;


public class FourElements2PairsEqualSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 4, 7, 1, 2, 9, 8};
		
		printPairs(arr);

	}

	private static void printPairs(int[] arr) {
		// TODO Auto-generated method stub
	
		Map<Integer, Map<Integer,Integer>> mapSum = new HashMap<Integer, Map<Integer,Integer>>(); 
		Map<Integer,Integer> pair = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr.length ; i++)
		{
			for(int j = i+1 ; j < arr.length ; j++)
			{
				
				int sum = arr[i] + arr[j] ;
				if(!mapSum.containsKey(sum))
				{
					pair.put(arr[i], arr[j]);
					mapSum.put(sum, pair);
				}
				else
				{
					System.out.println(arr[i] + " " + arr[j] + " " + mapSum.get(sum));
					return;
				}
			}
		}
		
		System.out.println("Not Pairs Found");
		
	}

}
