package Arrays2;
import java.util.HashMap;
import java.util.HashSet;


public class FirstRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,1,4,2,3,6,6};
		int[] arr2 = {1,2,2,3,1,4,1};
		int[] arr3 = {3,2,1,2,2,3};
		
		firstRepeatElement(arr);
	
		
	}
	

	private static void firstRepeatElement(int[] arr)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0 ; i< arr.length ; i++ )
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
			
		}
		
		for(int i = 0 ; i < arr.length; i++)
		{
			if(map.get(arr[i]) > 1)
			{
			   System.out.println("First Repeat Element is : "+ arr[i]);
			   return;
			}
		}
		
		
	}

	
}
