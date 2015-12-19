package General;
public class MultiplicationUsingAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int ans = multiply ( 5 , 6);
		int ans = multiply2(-989, -879);
		int ans1=multiply(-989, -879);
		System.out.println(ans1);
		System.out.println(ans);

	}

	private static int multiply(int x, int y) {
		// TODO Auto-generated method stub
		if (y == 0) {
			return 0;
		}
		if (y > 0) {
			return (x + multiply(x, y - 1));
		}

		if (y < 0) {
			return -multiply(x, -y);
		}

		return 0;

	}

	private static int multiply2(int a, int b) {
		int sign = 1;
		int adder = a;
		if (b == 0)
			return 0;
		if (a < 0 && b < 0) {
			a = -a;
			b = -b;
			adder = a;
		} else if (a < 0) {
			a = -a;
			sign = -sign;
		} else if (b < 0) {
			b = -b;
			sign = -sign;
		}
		while (b > 1) {
			a += adder;
			b--;
		}
		return a * sign;
	}
}
