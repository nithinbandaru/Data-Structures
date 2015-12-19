package Arrays2;
import java.util.LinkedHashMap;
import java.util.Map;


public class CheckTwoArraysForSameElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {2,5,6,8,10,2,2};
		
		int[] arr2 = {2,5,2,8, 10, 2, 6};
		
		twoArraysSame(arr1, arr2);

	}

	private static void twoArraysSame(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for(int i = 0 ; i< arr1.length; i++)
		{
			
			map.put(arr1[i],   map.containsKey(arr1[i]) ? map.get(arr1[i])+1 : 1);
			
		}
		
		for(int i = 0 ; i< arr2.length; i++)
		{		
			map.put(arr2[i],   map.containsKey(arr2[i]) ? map.get(arr2[i])-1 : 1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue() != 0)
			{
				System.out.println("Non Matching Arrays");
				return;
			}
		}
		System.out.println("Matching Arrays");
	}

}
