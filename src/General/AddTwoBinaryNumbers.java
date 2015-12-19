package General;

public class AddTwoBinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "11";
		String b = "1";
		
		String sum = binarySum(a,b);
		System.out.println("Binary sum = " + sum);

	}

	private static String binarySum(String a, String b) {
		// TODO Auto-generated method stub
		
		if(a==null || a.length() == 0)
		{
			return b;
		}
		if(b==null || b.length() == 0)
		{
			return a;
		}
		
		int lenA = a.length() - 1 ;
		int lenB = b.length() - 1 ;
		
		int flag = 0;
		
		StringBuilder binarySum = new StringBuilder();
		
		while(lenA >= 0 || lenB >= 0)
		{
			int valA = 0;
			int valB = 0;
			
			if(lenA >= 0)
			{
				valA = a.charAt(lenA) == '0' ? 0 : 1;
				lenA--;
			}
			if(lenB >= 0)
			{
				valB = b.charAt(lenB) == '0' ? 0 : 1;
				lenB--;
			}
			
			int sum = valA + valB + flag;
			
			if(sum >=2)
			{
				binarySum.append(String.valueOf(sum-2));
				flag = 1;
			}
			else
			{
				flag = 0;
				binarySum.append(String.valueOf(sum));
			}
		}
		
		if(flag==1)
		{
			binarySum.append("1");
		}
		
		String ans = binarySum.reverse().toString();
		
		return ans;
		
	}

}
