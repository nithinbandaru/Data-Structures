package General;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class RadixConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.out.println(Integer.toString( Integer.parseInt("13jl7f0e", 21), 7 ));



	}
	
	private static List<String> readFile()
	{
		String fileName = "C://Users//Nithin Reddy//Downloads//Happy-PracticeInput.txt";
        String line = null;
        List<String> listOfStrings = new ArrayList<String>();

        try 
        {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =  new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
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



}
