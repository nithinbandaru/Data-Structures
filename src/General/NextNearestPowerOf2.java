package General;

public class NextNearestPowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =  4;
		
		nextPowerOfTwo(num);

	}

	private static void nextPowerOfTwo(int num) {
		// TODO Auto-generated method stub
		
		int power = 1 ;
		double result = 1;
		while(result <= num)
		{
			result = Math.pow(2, power);
			power++;
		}
		
		System.out.println(result);
	}

}
