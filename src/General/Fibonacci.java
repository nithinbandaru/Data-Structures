package General;

public class Fibonacci {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8
		
		int number = 4;
		
		int fibNumber = fibonacciRecursive(number);
		//System.out.println(" fibonacci Recursive " + fibNumber);
		
		fibNumber = fibonacciIterative(number);
		
		System.out.println(" fibonacci Iterative " + fibNumber);
		

	}

	private static int fibonacciIterative(int number) {
		
		if (number <= 2)
		{
			return (number - 1);
		}
		
		int first = 0;
		int second = 1;
		int nextFib = 0;
		int sumFib = 1;
		for (int i = 3; i <= number ; i++)
		{
			nextFib = first + second;
			sumFib = sumFib + nextFib;
			first = second;
			second = nextFib;
		}
		System.out.println("Sum of Fib : " + sumFib);
		return nextFib;
	}

	private static int fibonacciRecursive(int number) {
		
		if (number <= 1)
		{
			return 1;
		}
		
		return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
		
	}

}
