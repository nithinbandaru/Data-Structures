package Arrays2;
import java.util.HashMap;
import java.util.Map;


public class FrequencyOfRepeatedNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = { 1,2,3,4,3,2,3,2,1,3,4,5};
		
		printFrequencies(myArray);

	}

	private static void printFrequencies(int[] myArray) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i: myArray)
		{
			map.put(i,  map.containsKey(i) ? map.get(i)+1 : 1);
			
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			
			int key = entry.getKey();
			int value = entry.getValue();
			
			System.out.println(key +" Frequency " + value);
		}
		
		
		
	}

}
