package General;
import java.util.Arrays;


public class PrintNextGreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] number = {'5','3','4','9','7','6'};
		
		Arrays.sort(number, 3,6);
	
		System.out.println(Arrays.toString(number));
		
		//nextGreaterNumber(number);
		

	}

	private static void nextGreaterNumber(char[] number) {
		// TODO Auto-generated method stub
		
		int i, j;
		
		int n = number.length;
		
		for ( i = n-1 ; i>= 0 ; i--)
		{
			if(number[i] > number[i-1])
			{
				System.out.println(number[i-1]);
				break;
			}
		}
		
		int index = i-1;
		
		if(i==0)
		{
			System.out.println("Next greater element not possible");
			return;
		}
		
		int nextSmallest = number[i];
		for(j = i+1 ; j < n ; j++)
		{
			
		}
		
		
	}

}
