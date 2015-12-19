package Arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1, 2, 3, 6};
	    int B[] = {4, 6, 8, 10};

	    double median = medianTwoSortedArrays(A, B , 0, A.length, 0 , B.length );
	    System.out.println("Median :" + median);
	    
	}

	private static double medianTwoSortedArrays(int[] arr1, int[] arr2, int startA,
			int endA, int startB, int endB) {
		// TODO Auto-generated method stub
		
		if( (endB-startB) == 1 && (endA-startA) == 1)
		{
			return ( 1.0 * max(arr1[startA] , arr2[startB]) + min(arr1[endA] , arr2[endB]))/2 ;
		}
		
		int m1_index = (startA + endA ) / 2 ;
		int m2_index = (startB + endB ) / 2 ;
		
		int m1 = arr1[m1_index];
		int m2 = arr2[m2_index];
		
		if( m1 == m2 )
		{
			return m1;
		}
		
		if(m1 < m2)
		{
			startA = m1_index;
			endB = m2_index;
			
		}
		
		else
		{
			startB = m2_index;
			endA = m1_index;
		}
		
		return medianTwoSortedArrays(arr1, arr2, startA, endA, startB, endB);
	}

	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		return (i > j ? i :j);
	}

	private static int min(int i, int j) {
		// TODO Auto-generated method stub
		return (i < j ? i :j);
	}

}
