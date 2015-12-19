package Arrays2;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class FindFirstNonRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,3,4,1,3};
		int arr2[] = {1,1,2,2,2};
		printFirstNonRepeatElement(arr2);

	}

	private static void printFirstNonRepeatElement(int[] arr) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		
		for(int i = 0 ; i<arr.length ; i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i]) + 1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		
		
		for(int i = 0; i< arr.length ; i++)
		{
			if(map.get(arr[i]) == 1)
			{
				System.out.println("First Non Repeat Element: "+ arr[i]);
				return;
			}
			
		}
		System.out.println("No non Repeating Elements");
	}

}
