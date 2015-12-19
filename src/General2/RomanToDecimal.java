package General2;

public class RomanToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String roman = "XC";
		int decimal = convertToDecimal(roman);
		System.out.println("decimal :"+decimal);

	}

	private static int convertToDecimal(String roman) {
		// TODO Auto-generated method stub
		if(roman.isEmpty())
		{
			System.out.println("Enter A Roman Numeral ");
			return -1;
		}
		int result = 0;
		if(roman.length()<=1)
		{
			return getValue(roman.charAt(0));
		}

		else
		{
			for(int i = 1 ; i < roman.length(); i++)
			{
								
				int currVal = getValue(roman.charAt(i-1));
				//System.out.println(currVal);
				int nextVal = getValue(roman.charAt(i));
				//System.out.println(nextVal);
				if(i==roman.length()-1)
				{
					result = result + nextVal;
					//return result;
				}
				if(currVal < nextVal)
				{
					result = result - currVal;
				}
				else
				{
					result = result + currVal;
				}
				
				
			}
		}
		
		return result;
	}

	private static int getValue(char ch) {
		// TODO Auto-generated method stub
		switch(ch)
		{
		case 'M':
			return 1000;
		case 'D':
			return 500 ;
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
		//return 0;
	}

}
