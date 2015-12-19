package General2;

public class SubtractWithoutOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(negativeOfANumber(-5));
		System.out.println("Subraction is : " + (6 + negativeOfANumber(5)));

	}
	
	public static int negativeOfANumber(int b)
	{
		int neg = 0;
		
		int d = b<0 ? 1 : -1 ;
		System.out.println("d: "+d);
		while(b != 0)
		{
			neg = neg + d;
			b = b + d;
			System.out.println("neg: "+neg + " b: "+b);
		}
		
		return neg;
	}

}
