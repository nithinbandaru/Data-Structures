package Hashing;
import java.util.HashMap;
import java.util.Map;


public class GetItineraryFromListOfTickets {

	public static void main(String[] args) {

		Map<String, String> itinerary = new HashMap<String, String>();		
		
		itinerary.put("Chennai" , "Banglore");
		itinerary.put("Bombay" , "Delhi");
		itinerary.put("Goa" , "Chennai");
		itinerary.put("Delhi" , "Goa");

		Map<String, String> reverseItinerary = new HashMap<String, String>();		
		
		for(Map.Entry<String, String> entry : itinerary.entrySet())
		{
			reverseItinerary.put(entry.getValue(), entry.getKey());
		}
		
		String start = "";
		for(Map.Entry<String, String> entry : itinerary.entrySet())
		{
			if(!reverseItinerary.containsKey(entry.getKey()))
			{
				start = entry.getKey();				
			}
		}
		
		System.out.print("Starting point: " + start + "->");
		while(true)
		{
			String next = itinerary.get(start);
			System.out.print(next + "->");
			start = next ;
			if(itinerary.get(start) == null)
			{
				break;
			}
		}
		
	}

}
