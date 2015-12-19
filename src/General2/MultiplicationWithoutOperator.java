package General2;

public class MultiplicationWithoutOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(multiply(3,4));

	}

	private static int multiply(int i, int j) {
		// TODO Auto-generated method stub
		if(i < j)
		{
			return multiply(j,i);
		}
		int sum = 0;
		for(int k = i; k>0 ; k--)
		{
			sum = sum + j;
		}
		
		return sum;
						
	}

}
