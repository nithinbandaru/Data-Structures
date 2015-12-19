package Hashing;

import java.util.HashMap;

public class BidirectionalHashMap {

	private HashMap<String, String> keyValueMap;
	private HashMap<String, String> valueKeyMap;
	
	public BidirectionalHashMap()
	{
		keyValueMap = new HashMap<String, String>();
		valueKeyMap = new HashMap<String, String>();
	}
	
	public void clearContents()
	{
		keyValueMap.clear();
		valueKeyMap.clear();
	}
	
	public int mapSize()
	{
		return keyValueMap.size();
	}
	
	public void putElement(String key , String value)
	{
		keyValueMap.put(key, value);
		valueKeyMap.put(value, key);
	}
	
	public String getElement(String keyOrValue)
	{
		String str = keyValueMap.get(keyOrValue);
		if(str==null)
		{
			str = valueKeyMap.get(keyOrValue);
		}
		
		return str;
	}
	
	public void removeElement(String element)
	{
		
		String value = keyValueMap.get(element);
		if(value != null)
		{
			keyValueMap.remove(element);
			valueKeyMap.remove(value);
		}
		else
		{
			value = valueKeyMap.get(element);
			
			if(value != null)
			{
				keyValueMap.remove(value);
				valueKeyMap.remove(element);
			}
			else
			{
				System.out.println("Element Not Found");
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BidirectionalHashMap biMap = new BidirectionalHashMap();
		
		biMap.putElement("N", "M99");
		biMap.putElement("V", "M123");
		biMap.putElement("F", "M55");
		biMap.putElement("S", "M80");
		biMap.putElement("A", "M110");

		System.out.println(biMap.getElement("N"));
		System.out.println(biMap.getElement("M99"));
		System.out.println(biMap.getElement("V"));
		System.out.println(biMap.getElement("M123"));
		System.out.println(biMap.getElement("F"));
		System.out.println(biMap.getElement("M55"));
		System.out.println(biMap.getElement("S"));
		System.out.println(biMap.getElement("A"));
		System.out.println(biMap.getElement("M80"));
		System.out.println(biMap.getElement("M110"));
		
		biMap.removeElement("A");
		System.out.println(biMap.getElement("A"));
		
	}

}
