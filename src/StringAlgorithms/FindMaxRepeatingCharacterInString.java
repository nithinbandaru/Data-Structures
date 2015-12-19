package StringAlgorithms;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class FindMaxRepeatingCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nithin reddy";
		System.out.println("Max Repeat character :"+maxRepeatCharacter(str));;

	}

	private static Character maxRepeatCharacter(String str) {
		// TODO Auto-generated method stub
		TreeMap<Character,Integer> map = new TreeMap<Character, Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(map.get(str.charAt(i))==null)
			{
				map.put(str.charAt(i), 1);
			}
			else
			{
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
		}
		
		int max = 0;
		char ch ='0';
		
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			  Character key = entry.getKey();
			  Integer value = entry.getValue();
			  if(value > 1 )
			  {
				  System.out.println("Character: "+ key +" Repeats: "+ value);
			  }
				if(value >max){
					ch = key;
					max = value;
				}
			}
		
		return ch;
		
	}

}
