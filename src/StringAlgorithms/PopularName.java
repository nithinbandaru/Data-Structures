package StringAlgorithms;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class PopularName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = { "nithin", "nitro", "nitro", "somu" , "madhur", "nithin", "nitro"};
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String s: names)
		{
			map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
		}
		
		TreeMap<Integer, ArrayList<String>> treeMap = new TreeMap<Integer, ArrayList<String>>();
		
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			String key = entry.getKey();
			int val = entry.getValue();
					
			if(treeMap.containsKey(val))
			{
				treeMap.get(val).add(key);
			}
			else
			{
				ArrayList<String> list = new ArrayList<String>();
				list.add(key);
			    treeMap.put(val, list);
			    
			}
				
			
			
		}
		for(Map.Entry<Integer, ArrayList<String>> entry : treeMap.entrySet())
		{
		
			System.out.println( entry.getKey() +" : " + entry.getValue());
		}
			
		

	}

}
