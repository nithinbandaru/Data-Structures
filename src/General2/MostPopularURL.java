package General2;
import java.util.*;
import java.net.*;
import java.io.*;


public class MostPopularURL {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		try {
			URL url = new URL("https://gist.githubusercontent.com/anonymous/d2ec2461468d4a0372db/raw/b1eb88fa20b147deaafa9e38768174d79f705805/gistfile1.txt");
			InputStream inputStream = url.openStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			String line = null;
			
			while(reader.readLine() != null)
			{				
				line = reader.readLine();
				
				if(map.containsKey(line))
				{
					map.put(line, map.get(line)+1);
				}
				else
				{
					map.put(line, 1);
				}
			//	map.put(line, map.containsKey(line) ? map.get(line)+ 1: 1);			
				
			}
			
			int maxCount = 0;
			String popularUrl = null;
			System.out.println("map size: " + map.size());
			
			for(Map.Entry<String, Integer> entry : map.entrySet())
			{
				String key = entry.getKey();
				int value = entry.getValue();
				if(value > maxCount)
				{
					maxCount = value;
					popularUrl = key;
				}
			}
			
			System.out.println("Most popular URL: " + popularUrl + " occurs " + maxCount +" times");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
