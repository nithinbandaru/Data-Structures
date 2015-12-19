package Arrays2;
import java.util.LinkedHashMap;
import java.util.Map;


public class GroupRepeatedElementsTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5, 1, 5, 1, 3, 3};
		
		int[] groupedArray = groupArray(arr);

		for(int i: groupedArray)
		{
			System.out.print(i+" ");
		}
	}

	private static int[] groupArray(int[] arr) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer, Integer>();
		int[] groupedArray = new int[arr.length];
		for(int a : arr)
		{
			map.put(a, map.containsKey(a)? map.get(a)+1 : 1);
		}
		
		int index = 0;
		for(Map.Entry<Integer,Integer> entry: map.entrySet())
		{
			System.out.println(entry.getKey() + " - " + entry.getValue());
			int key = entry.getKey();
			int val = entry.getValue();
			while(val!=0)
			{
				groupedArray[index++] = key;
				val--;
			}
		}
			
		
		return groupedArray;
	}

}
