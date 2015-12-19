package StringAlgorithms;

import java.util.Random;

public class QuickSortAlgorithm {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "oSzKasAxlaByZ";
		System.out.println(sortString(str));
		
	}

	public static String sortString(String s)
	{
		
		char[] A = s.toCharArray();
		
		//printArray(A);
		QuickSort(A, 0 , A.length-1);
		String str1 = new String(A);
		//printArray(A);
		
		return str1;
	}
	private static void printArray(char[] A) {

		for(char i : A)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

	private static void QuickSort(char[] A, int start, int end) {

		if(start < end)
		{
			int partionIndex = RandomizedPartition(A, start, end);
			QuickSort(A, start, partionIndex-1);
			QuickSort(A, partionIndex+1, end);
		}
		
	}

	private static int RandomizedPartition(char[] A, int start, int end)
	{
		Random random = new Random();
		int pivotIndex = random.nextInt(end - start) + start;
		char temp = A[pivotIndex];
		A[pivotIndex] = A[end];
		A[end] = temp;
		pivotIndex = partitionArray(A,start,end);
		return pivotIndex;
	}
	
	
	private static int partitionArray(char[] A, int start, int end) {

		int pivot = A[end];
		int partitionIndex = start;
		
		for(int i=start; i < end ; i++)
		{
			
			if(A[i] < pivot)
			{	
				char temp = A[i];
				A[i] = A[partitionIndex];
				A[partitionIndex] = temp;
				partitionIndex++;
				
			}
			
		}
		
		char temp = A[partitionIndex];
		A[partitionIndex] = A[end];
		A[end] = temp;
		
		return partitionIndex;
	}

}