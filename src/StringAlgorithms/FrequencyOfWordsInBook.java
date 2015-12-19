package StringAlgorithms;
import java.util.HashMap;


public class FrequencyOfWordsInBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] book = {"dog", "cat" , "dog", "mouse", " dog", "rose", "cat"};
		
		findFrequency(book, "dog");
	}

	private static void findFrequency(String[] book, String findWord) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String word : book)
		{
			word = word.toLowerCase().trim();
			
		
			if(!map.containsKey(word))
			{
				map.put(word, 1);
			}
			else
			{
				map.put(word,  map.get(word) + 1);
			}
		
			
		}
		
		
		if(map.containsKey(findWord))
		{
			System.out.println("Frequency : " + map.get(findWord));
		}
		else
		{
			System.out.println("word not found");
		}
		
	}

}
