package General2;
import java.util.ArrayList;
import java.util.HashMap;


public class PhoneKeyPad {

	public static void main(String[] args) {

		HashMap<Integer, ArrayList<Character>> keypad = new HashMap<Integer, ArrayList<Character>>();
		String[] key = {"","","abc","def","ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		
		String num = "8733";
		
		int len = num.length();
		
		ArrayList<StringBuilder> strList = new ArrayList<StringBuilder>();
		
		for(int i=0 ; i<len ; i++)
		{
			int ch = (int)(num.charAt(i));
			String entry = key[ch-48];
			if(i==0)
			{
				for(int j =0 ; j <entry.length(); j++)
				{
					//strList.add((entry.charAt(j)));
					
				}
				
			}
			else
			{
				int size = strList.size();
				System.out.println(size);
				for(int j =0 ; j <entry.length()-1; j++)
				{
					for(int k = 0 ; k < size ; k++)
					{
						strList.add(strList.get(k));
					}
				}
				size = strList.size();
				int prevSize = size/ entry.length();
				System.out.println(prevSize + "---");
				for(int j =0 ; j <prevSize; j++)
				{
					for(int k = 0 ; k < size ; k++)
					{
						//strList.get(k) += entry.charAt(j);
					}
				}
				
				break;
			}
			
			
			//System.out.println(entry);
		}
		
		for(StringBuilder str : strList)
		{
			System.out.println(str);
		}
		
	}

}
