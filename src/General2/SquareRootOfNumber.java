package General2;

public class SquareRootOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sqrt of 25: "+findSquareRoot(25));
	}
	
	
	public static double squareRoot(int num){
		double target = (double)num;
		double mid = (double)num/2;
		double start = 0.0;
		double end = target;
		while(!((mid * mid) <= target + 0.001 && (mid * mid) >= target - 0.001)){
			if((mid * mid) > num){
				end = mid;
			}
			else
				start = mid;
			mid = (start + end)/2;
		}
		return mid;
	}
	
	public static double findSquareRoot(double num)
	{
		//double ans = 0.00;
		if(num < 0 )
		{
			return -1;
		}
		if(num == 0 || num == 1)			
		{
			return num;
		}
		
		double precision = 0.00001;
		double start = 0;
		double end = num;
		if(num < 1)
		{
			end = 1;
		}
		double mid = 0;
		
		while((end - start) > precision)
		{
			
			mid = (start + end )/2;
			System.out.println("start " + start + " mid " + mid + " end "+ end);
			double midSqr = mid*mid;
			if(midSqr == num)
			{
				return mid;
			}
			else if (midSqr < num)
			{
				start = mid;
			}
			else
			{
				end = mid;
			}	
			
		}
		
		return (start+end)/2;
		
	}

}
