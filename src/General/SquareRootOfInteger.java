package General;

public class SquareRootOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 19;
		
		int sqrt = squareRoot(num);
		System.out.println("Square root : " + sqrt);

	}

	private static int squareRoot(int num) {
		// TODO Auto-generated method stub
		if( num == 0 || num == 1)
		{
			return num;
		}
		int low = 0 ;
		int high = num ;
		int sqrt = Integer.MIN_VALUE;
		while( low <= high)
		{
			int mid = low + (high - low)/2 ;
			
			if( mid * mid  == num)
			{
				sqrt = mid;
			}
			else if(mid * mid < num)
			{
				low = mid +1 ;
				sqrt = mid;
			}
			else
			{
				high = mid - 1;
			}
		}
		
		
		return sqrt;
	}

}
