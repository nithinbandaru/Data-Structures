package Arrays;
import java.util.HashSet;


public class ArrayPairSum {

	// Time  = O(n)
	// Space = O(n)
	
	public static void main(String[] args) {
				
		int A[] = {1, 9, 45, 6, 10, 7};
		int B[] = {-1,2,5,3,2};
		int sum = 16;
		printPairs(A,sum);
		
		printPairs(B, 4);

	}

	private static void printPairs(int[] A, int sum) {
				
		HashSet<Integer> set = new HashSet<Integer>();
		for ( int i =0 ; i < A.length ; i++)
		{
			set.add(A[i]);
		}
		
		for ( int j =0 ; j < A.length ; j++)
		{
			int temp = sum - A[j];
			if(set.contains(temp))
			{
				System.out.println(temp + "--" + A[j]);
				set.remove(A[j]);
			}
		}
	}

}
