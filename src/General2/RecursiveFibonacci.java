package General2;

public class RecursiveFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		 for (int i = 1; i <= n; i++)
	            System.out.print(fibonacci(i)+" ");
		
	}
	
	public static int fibonacci(int n)  {	    
	    if(n <= 1)
	      return n;
	   else
	      return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
