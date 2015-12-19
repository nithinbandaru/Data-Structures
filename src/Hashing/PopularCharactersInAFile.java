package Hashing;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PopularCharactersInAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filepath = "C:\\Users\\Nithin Reddy\\Downloads\\PopularCharacters.txt";

		File file = new File(filepath);

		if (!file.exists()) {
			System.out.println("File Does Not Exists");
		} else {
			System.out.println("File Exists");

			try {
				FileInputStream inputStream = new FileInputStream(file);
				HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
				char ch;

				while (inputStream.available() > 0) {
					ch = (char) inputStream.read();
					hashMap.put(ch, hashMap.containsKey(ch) ? hashMap.get(ch) + 1 : 1);
					System.out.print(ch);
				}
				System.out.println();
				//System.out.println(hashMap);
				
				
				TreeMap<Integer, ArrayList<Character>> treeMap = new TreeMap<Integer, ArrayList<Character>>();
				for(Map.Entry<Character, Integer> entry : hashMap.entrySet())
				{
					Character key = entry.getKey();
					int val = entry.getValue();
							
					if(treeMap.containsKey(val))
					{
						treeMap.get(val).add(key);
					}
					else
					{
						ArrayList<Character> list = new ArrayList<Character>();
						list.add(key);
					    treeMap.put(val, list);
					    
					}
					
				}
				
				System.out.println(treeMap.descendingMap());
				
				
				
				
				
				
				
				
				
			}

			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
