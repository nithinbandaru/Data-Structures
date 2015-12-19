package SortingAlgorithms;

public class KthSmallestElementQuickSort {

	public static void main(String[] args) {

		int[] arrA = { 2, 3, 11, 16, 27, 4, 15, 9, 8 };
		
		for(int i : arrA)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		int k = 4;
		
		int kthSmallest = printKthSmallestElement(arrA , 0, arrA.length- 1 , k-1);
		
		for(int i : arrA)
		{
			System.out.print(i + " ");
		}
		
		//System.out.println(kthSmallest);
		
	}

	private static int printKthSmallestElement(int[] arrA, int start , int end , int k) {

		int left = start ;
		int right = end ;
		
		int pivot = start;
		
		while (left <= right)
		{
		
			while (left <= right && arrA[left] <= arrA[pivot])
			{
				left++;
			}
				
			while (left <= right && arrA[right] >= arrA[pivot])
			{
				right--;
			}
				
			if (left < right) {
				swap(arrA, left, right);
				left++;
				right--;
			}
		}
		swap(arrA, pivot, right);
		if (pivot == k)
			return arrA[pivot];// if pivot is kth element , return
		else if (pivot < k)
			// if pivot is less than k, then kth element will be on the right
			return printKthSmallestElement(arrA, pivot + 1, end, k);
		else
			// if pivot is greater than k, then kth element will be on the right
			return printKthSmallestElement(arrA, start, pivot - 1, k);
	}


	public static void swap(int[] arrA, int a, int b) {
	int x = arrA[a];
	arrA[a] = arrA[b];
	arrA[b] = x;
	}

}
