package Arrays;
import java.util.HashMap;
import java.util.Map;


public class MajorityElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr  = {3 ,3 ,4 ,2, 4 ,4 ,2 ,4 ,4};
		int[] arr2 = {3 ,3, 4 , 2, 4, 4, 2, 4};
		
		int majorityElement = getMajorityElement(arr2);
		System.out.println("Majority Element : " + majorityElement);
	}

	private static int getMajorityElement(int[] arr) {
		// TODO Auto-generated method stub
		HashMap<Integer , Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0 ; i < arr.length; i++)
		{
			map.put(arr[i],  map.containsKey(arr[i]) ? map.get(arr[i]) + 1 : 1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			int n = arr.length;
			
			if( entry.getValue() > n/2)
			{
				return entry.getKey();
			}
		}		
		
		return Integer.MIN_VALUE;
	}

}
