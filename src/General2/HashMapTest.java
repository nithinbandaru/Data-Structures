package General2;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class HashMapTest {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("A", 11);
		map.put("B", 22); 
		
		for(String key : map.keySet())
		{
			System.out.println(key +"->" + map.get(key));
		}
		
		
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
		
		map.put("A", 15);
		
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
		
		
		final Date  date = new Date();
		System.out.println(date);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 10); // add 10 days
		 
				
	}

}
