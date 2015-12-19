package General;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class HappyNumbers {

	static int count = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listOfInteger = readFile();
		String status = ""; 
		for(int num : listOfInteger)
		{
			boolean isHappy = HappyNumber(num);
			if(isHappy)
			{
				status = "happy";
			}
			else
			{
				status = "unhappy";
			}
			System.out.println( status + " " + count);
			count = 1;
				
		}
		
	}
	
	private static List<Integer> readFile()
	{
		String fileName = "C://Users//Nithin Reddy//Downloads//Happy-numbers_InputForSubmission_2.txt";
        String line = null;
        List<Integer> listOfIntegers = new ArrayList<Integer>();

        try 
        {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =  new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
                listOfIntegers.add(Integer.parseInt(line));
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
        return listOfIntegers;
  }

	private static boolean HappyNumber(int num) {
		// TODO Auto-generated method stub
		if(num == 1)
		{
			count = 0;
			return true;
		}
		
		List<Integer> digits = getDigits(num);	
		int sumOfSquares = getSumOfSquares(digits);
		int sumOfSquare = sumOfSquares;
		Set<Integer> result = new HashSet<Integer>();		
		result.add(sumOfSquare);
		
		while(sumOfSquare != 1)
		{
			List<Integer> digits2 = getDigits(sumOfSquare);		
		    sumOfSquare = getSumOfSquares(digits2);
		    count++;
		    if(result.contains(sumOfSquare))
		    {
		    	return false;
		    }
		    else
		    {
		    	result.add(sumOfSquare);
		    }
		}
		return true;
	}
	
	private static int getSumOfSquares(List<Integer> digits) {
		
		int sumSquares = 0;
		for(int i: digits)
		{
			//System.out.print(i + " ");
			sumSquares = sumSquares + i*i; 
		}
		return sumSquares;
	}

	private static List<Integer> getDigits(int num)
	{
		List<Integer> digits = new ArrayList<Integer>();
		int givenNum = num;
		
		while(givenNum != 0 )
		{
			int digit = givenNum % 10;			
			digits.add(digit);
			givenNum = givenNum / 10;
			
		}
		
		return digits;
		
	}
	

}
