package General2;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
	System.out.println(fibonacciRecursive(6));
	
	System.out.println(fibonacciIterative(5));
	
	}

	private static int fibonacciIterative(int num) {

		if(num < 0 ){
			throw new IllegalArgumentException("Number cant be negative");
		}
		
		if(num == 0 || num == 1){
			return num;
		}
		
		int a = 0;
		int b = 1;
		
		int c = a+b;
		
		for(int i=2; i <=num ; i++){
			c= a+b;
			a= b; 
			b= c;
			System.out.print(c+ " ");
			
		}
		System.out.println();
		
		return c;
	}

	// Recursion 
	public static int fibonacciRecursive(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}
}
