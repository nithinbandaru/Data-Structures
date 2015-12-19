package Arrays2;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 12, 15, 26, 38};
	    int arr2[] = {2, 13, 17, 30};
	 
		
		int median = medianOfArrays(arr1,arr2);
		System.out.println("median :"+median);
	}

	private static int medianOfArrays(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int median = 0;
		int i = 0;
		int j = 0;
		int[] arr3 = new int[arr1.length + arr2.length];
		int index = 0;
		
		while( i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				arr3[index]=arr1[i];
				i++;
				index++;
			}
			else 
			{
				arr3[index] = arr2[j];
				j++;
				index++;
			}
			
		}
		for(int k=0;k<arr3.length-1;k++)
		{
			System.out.print(arr3[k]+" ");
		}
		int size = arr3.length;
		if(size % 2 != 0)
		{
			median = arr3[(size-1)/2];
		}
		else
		{
			median = (arr3[size/2]+arr3[(size+2)/2])/2;
		}
		return median;
	}

}
