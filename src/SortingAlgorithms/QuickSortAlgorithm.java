package SortingAlgorithms;

import java.util.Random;

public class QuickSortAlgorithm {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 7, 2 , 1, 6 , 8 , 5 , 3, 4};
		
		printArray(A);
		QuickSort(A, 0 , 7);
		printArray(A);
		
	}

	private static void printArray(int[] A) {

		for(int i : A)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

	private static void QuickSort(int[] A, int start, int end) {

		if(start < end)
		{
			int partionIndex = RandomizedPartition(A, start, end);
			QuickSort(A, start, partionIndex-1);
			QuickSort(A, partionIndex+1, end);
		}
		
	}

	private static int RandomizedPartition(int[] A, int start, int end)
	{
		Random random = new Random();
		int pivotIndex = random.nextInt(end - start) + start;
		int temp = A[pivotIndex];
		A[pivotIndex] = A[end];
		A[end] = temp;
		pivotIndex = partitionArray(A,start,end);
		return pivotIndex;
	}
	
	
	private static int partitionArray(int[] A, int start, int end) {

		int pivot = A[end];
		int partitionIndex = start;
		
		for(int i=start; i < end ; i++)
		{
			
			if(A[i] < pivot)
			{	
				int temp = A[i];
				A[i] = A[partitionIndex];
				A[partitionIndex] = temp;
				partitionIndex++;
				
			}
			
		}
		
		int temp = A[partitionIndex];
		A[partitionIndex] = A[end];
		A[end] = temp;
		
		return partitionIndex;
	}

}