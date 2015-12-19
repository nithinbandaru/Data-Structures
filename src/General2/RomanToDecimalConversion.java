package General2;

public class RomanToDecimalConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String roman = "XIX";
		int decimal = convertToDecimal(roman);
		System.out.println("Decimal: " + decimal);
	}

	private static int convertToDecimal(String roman) {
		// TODO Auto-generated method stub
		int value = 0 ;
		for(int i=1; i<roman.length(); i++)
		{
			char currentChar = roman.charAt(i-1);
			char nextChar = roman.charAt(i);
			int currVal = getValue(currentChar);
			int nextVal = getValue(nextChar);
			if(currVal < nextVal)
			{
				value = value - currVal;
			}
			else
			{
				value = value + (currVal);
			}
			if(i == roman.length() -1)
				value = value + nextVal;
		}
		return value;
	}

	private static int getValue(char ch) {
		// TODO Auto-generated method stub
		switch(ch)
		{
		 case 'M':
			 return 1000;
			 
		 case 'D':
			 return 500;
			 
		 case 'C':
			return 100;
			 
		 case 'L':
			 return 50;
			 
		 case 'X':
			 return 10;
			 
		 case 'V':
			 return 5;
			 
		 case 'I':
			 return 1;
			 
		default:
			return 0;
		}
	
	}

}
