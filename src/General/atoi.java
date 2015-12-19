package General;

public class atoi {

	public static void main(String[] args) {
		
		String str = "-15345";		
		
		int num = StringToIntegerConversion(str);
		System.out.println(" atoi of " + str + " is " + num);
		
		
	}

	
	private static int StringToIntegerConversion(String str)
	{
		
		if(str == null || str.length() < 1)
		{
			return 0;
		}
		
		// trim white spaces
		
		str = str.trim();
		
		char flag = '+';
		
		int i = 0 ;
		
		if(str.charAt(i) == '-')
		{
			flag = '-';
			i++;
		}
		else if(str.charAt(i) == '+')
		{
			i++;
		}
		
		int result = 0;
		
		
		while(str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9')
		{
			
			result = 10 * result + (str.charAt(i) - '0');
			i++;
		}
			
		if(flag == '-')
		{
			result = -result;
		}
		
		// handle max and min
		if (result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
	 
		if (result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
	 
		return result;
		
	}	

}
