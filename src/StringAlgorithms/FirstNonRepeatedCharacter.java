package StringAlgorithms;
import java.util.LinkedHashMap;
import java.util.Map;


public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-gene
		
		String str = "gekkgesk";
		findFirstNonRepeatCharacter(str);
		
	}

	private static void findFirstNonRepeatCharacter(String str) {
		// TODO Auto-generated method stub
		
		Map<Character , Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i = 0 ; i < str.length(); i++)
		{
			map.put(str.charAt(i),  map.containsKey(str.charAt(i)) ? map.get(str.charAt(i)) + 1 : 1);
			
		}
		
		for(Map.Entry<Character,Integer> entry : map.entrySet())
		{
			if(entry.getValue() == 1)
			{
				System.out.println(entry.getKey() +" is first repeated character");
				break;
			}
			
		}
		
	}

}
