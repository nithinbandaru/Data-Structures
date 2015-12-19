package General2;

public class GCDEuclid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gcd(105, 350);
		
	}

	private static void gcd(int i, int j) {
		// TODO Auto-generated method stub
		
		int dividend = i;
		int divisor = j;
		while(divisor != 0)
		{
			int remainder = dividend % divisor;
			dividend = divisor;
			divisor = remainder;
	
		}
		
		System.out.println("GCD: " + dividend);
	}

}
