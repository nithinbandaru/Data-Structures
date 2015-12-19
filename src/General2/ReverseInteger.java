package General2;
public class ReverseInteger {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1232;
		int reverseNum = reverseInteger(x);
		System.out.println(3.0*0.1);
		System.out.println("reverse Integer: " + reverseNum);
	}

	private static int reverseInteger(int x) {
		// TODO Auto-generated method stub

		int givenNum = x;
		int result = 0;
		int modulus;

		while (givenNum > 0) {
			modulus = givenNum % 10;
			System.out.println("Modulus: "+modulus);
			givenNum = givenNum / 10;
			System.out.println("givenNum: "+givenNum);
			result = modulus + result * 10;
			System.out.println("result: "+result);
			
		}

		return result;

	}

}
 