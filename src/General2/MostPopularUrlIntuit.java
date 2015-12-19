package General2;
import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;

public class MostPopularUrlIntuit
{

	public static void main(String[] args) 
	{
		try
		{
			URL url = new URL("https://gist.githubusercontent.com/anonymous/d2ec2461468d4a0372db/raw/b1eb88fa20b147deaafa9e38768174d79f705805/gistfile1.txt");
			InputStream is = url.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String line;
			HashMap<String, Integer> url_repeat_count_map = new HashMap<String, Integer>();
			
			while((line = br.readLine()) != null)
			{
				if(url_repeat_count_map.containsKey(line))
				{
					int current_count = url_repeat_count_map.get(line);
					url_repeat_count_map.put(line, (current_count + 1));
				}
				else
				{
					url_repeat_count_map.put(line, 1);
				}
			}
			
			System.out.println("map size: " + url_repeat_count_map.size());
			
			Iterator<String> all_urls = url_repeat_count_map.keySet().iterator();
			String most_repeated_url = null;
			int most_repeated_url_count = 0;
			
			while(all_urls.hasNext())
			{
				String input_line = all_urls.next();
				int count = url_repeat_count_map.get(input_line);
				
				if(count > most_repeated_url_count)
				{
					most_repeated_url_count = count;
					most_repeated_url = input_line;
				}				
			}
			
			System.out.println("most repeated url " + most_repeated_url);
			System.out.println("num repeatations is " + most_repeated_url_count);
		}
		catch(Exception e)
		{
			
		}
	}

}
