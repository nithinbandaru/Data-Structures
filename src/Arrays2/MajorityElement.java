package Arrays2;
import java.util.HashMap;
import java.util.Map;


public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 3, 4, 2, 4, 4, 2, 4,4};
		int size = arr.length;
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], 1);
			}
			else
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			int key = entry.getKey();
			int value = entry.getValue();
			System.out.println("key: "+key+" value: "+value);
			if(value>=size/2)
			{
				System.out.println("majority element: "+key+" value: "+value);
				return;
			}
		}
		
		
			System.out.println("No such element exists");
		


	}

}
