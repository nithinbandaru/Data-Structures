package General;

public class Return2When1isPassedViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		int val = function1(num);
		System.out.println("Val returned function1: "+ val);
		
		int val2 = function2(num);
		System.out.println("Val returned function2: "+ val2);
		
	}

	private static int function2(int num) {
		// TODO Auto-generated method stub
		return (3 - num);
	}

	private static int function1(int num) {
		// TODO Auto-generated method stub
		
		if(num == 1)
		{
			return 2;
		}
		else if( num == 2)
		{
			return 1;
		}
		
		return Integer.MIN_VALUE;
	}

}
