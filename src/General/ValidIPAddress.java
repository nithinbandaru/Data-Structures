package General;

public class ValidIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ipAddress = "128.0.0.301";
		
		boolean isValid = isValidIPAddress(ipAddress);
		
	}

	private static boolean isValidIPAddress(String ipAddress) {
		// TODO Auto-generated method stub
		
		String ip = ipAddress;
		System.out.println(ip);
		if(ipAddress == null)
		{
			return false;
		}
		
		int dotsCount = 0;
		for(int i = 0 ;i<ip.length(); i++)
		{
			if(ip.charAt(i) == '.')
			{
				dotsCount++;
			}
		}
		
		if(dotsCount !=3)
		{
			return false;
		}
		else
		{
			System.out.println("dots coount : " + dotsCount);
		}
		
		System.out.println(" character is digit "+ Character.isDigit('9'));
		
		System.out.println(" character is letter "+ Character.isLetter('9'));
		
		
		String[] tokens = ipAddress.split("\\.");
		
		for(int i =0 ; i<tokens.length ; i++)
		{
			System.out.println(tokens[i]);
			if(!isValidNumber(tokens[i]))
			{
				return false;
			}		
			
			else
			{
				int num = Integer.parseInt(tokens[i]);
				
				if(num >= 0 && num <=255)
				{
					System.out.println("Valid IP range");
				}
				else
				{
					System.out.println("Not a valid range");
					return false;
				}
				
				
			}
		}
		
		return false;
	}

	private static boolean isValidNumber(String str) {
		// TODO Auto-generated method stub
		
		if (str.length() > 3 )
		{
			return false;
		}
		for(int i =0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			
			if( ch < 48 && ch > 57)
			{
				System.out.println("Its a not digit");
				return false;
			}
			
		}
		
		return true;
		
	}

}
