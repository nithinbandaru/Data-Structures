package StringAlgorithms;

public class atoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str  = "12234";
		int result=atoiHarsh(str);
		if(result==-1)
		{
			System.out.println("Ma chuda sahi number daal madarchod");
		}
		else
		{
		System.out.print("Thik hain ye le int representation-->"+result);
		}
		
		System.out.println();
		System.out.println((Integer.parseInt(str)));
		myatoi(str);

	}

	private static void myatoi(String str) {
		// TODO Auto-generated method stub
		
		int result = 0 ;
		int sign = 1;
		int i = 0;
		if(str.charAt(0) == '-')
		{
			sign = -1;
			i++;
		}
		
		for( ; str.charAt(i) != '\0'; i++)
		{
			result = result * 10 + str.charAt(i) - '0';
			
		}
		
		System.out.println("Numeral is: " + sign*result);
	
	}
	public static int atoiHarsh(String s)
	{
		char[] a=s.toCharArray();
		int l=a.length-1;
		boolean isNegative=false;
		int h=0,result=0,i=0;
		if(a[0]=='-')
		{
			isNegative=true;
			i=1;
			l--;
		}
		for(;i<a.length;i++)
		{
			if(a[i]<48 || a[i]>57)
			{
				return -1;
			}
			h=a[i]-48;
			System.out.println(h);
			result=result+(int)(h*Math.pow(10,l));
			l--;
		}
		if(isNegative)
		{
			result=result*-1;
		}
		return result;
	}

}
