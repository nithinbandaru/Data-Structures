package General;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class PalindromicAnagrams {

	static Set<String> anagrams = new HashSet<String>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readFile();
		printPermutations("", "acad");
		Set<String> palindromes = new HashSet<String>();
		for(String s : anagrams)
		{
			//System.out.println(s);
			if(isPalindrome(s))
			{
				palindromes.add(s);
			}
		}
		int palindromeSize = palindromes.size();
		if(palindromeSize == 0)
		{
			System.out.println("No palindromes");
		}
		
		char[] arr = "acad".toCharArray();
		List<String> substr = new ArrayList<String>(); 
		StringBuffer buff ;
		
		for(int i=0; i< arr.length ; i++)
		{
			buff = new StringBuffer("");
			for(int count=0; count < arr.length ; count++)
			{
				if(count != i)
				{
					buff.append(arr[count]);	
					
				}		
				
			}
			substr.add(buff.toString());
		}
		
		for(String p : substr)
		{
			System.out.println(p);
		}
		
		for(String p : palindromes)
		{
			System.out.println(p);
		}
		

	}

	private static boolean isPalindrome(String original)
	{
		  int length = original.length();
		  String reverse = "";
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      if (original.equals(reverse))
	         return true;
	      else
	         return false;
		
	}
	
	private static List<String> readFile()
	{
		String fileName = "C://Users//Nithin Reddy//Downloads//PracticeInput.txt";
        String line = null;
        List<String> listOfStrings = new ArrayList<String>();

        try 
        {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =  new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
                listOfStrings.add(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) 
        {
        	ex.printStackTrace();            
        }
        catch(IOException ex) 
        {
        	ex.printStackTrace();
             
        }	
        return listOfStrings;
  }


	public static void printPermutations(String prefix, String suffix)
	{
		if(suffix.length() == 0)
		{
			//System.out.println(prefix);
			anagrams.add(prefix);
		}
		else
		{
			for(int i = 0; i < suffix.length(); i++)
			{
				printPermutations(prefix + suffix.charAt(i), 
						suffix.substring(0, i) + suffix.substring(i+1, suffix.length()));
			}
		}
		
	}	
}
