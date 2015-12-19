package General;

public class MultiplicationByAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		multiply(8,-3);
	}

	private static void multiply(int i, int j) {
		// TODO Auto-generated method stub
		int max = (i > j) ? i : j ;
		int min = (j > i) ? i : j ;		
		int result = 0 ;
		
		while( min > 0 )
		{
			result = result + max;
			min--;
		}
		System.out.println(result);
	}

}
