package Arrays;

public class MergeTwoSortedArraysInOne {

	public static void main(String[] args) {

		int mPlusN[] = {2, 8, -1 , -1 , -1 , 13, -1, 15, 20};
		int N[] = {5, 7, 9, 25};
		
		int index = pushToEnd(mPlusN);
		System.out.println(index);
		printArray(mPlusN);
		mergeSortedArrays(mPlusN, N , index);
		System.out.println();
		printArray(mPlusN);		
	}

	private static void mergeSortedArrays(int[] arr1, int[] arr2, int start) {
		// TODO Auto-generated method stub
		
		int i = start + 1; 
		int j = 0;
		
		int index = 0;
		
		while( i < arr1.length && j < arr2.length )
		{
			if(arr1[i] < arr2[j])
			{
				arr1[index] = arr1[i];
				i++;
			}
			else if(arr1[i] > arr2[j])
			{
				arr1[index] = arr2[j];
				j++;
			}
			index++;
		}
		
		while(i < arr1.length)
		{
			arr1[index] = arr1[i];
			i++;
		}
		
		while(j < arr2.length)
		{
			arr1[index] = arr2[j];
			j++;
		}
	}

	private static void printArray(int[] mPlusN) {
		
		for(int i = 0 ; i<mPlusN.length ; i++)
		{
			System.out.print(mPlusN[i] + " ");
		}
		
	}

	private static int pushToEnd(int[] mPlusN) {

		int j = mPlusN.length-1;
		
		for(int i = mPlusN.length-1 ; i >= 0 ; i--)
		{
			if(mPlusN[i] != -1)
			{
				mPlusN[j] = mPlusN[i];
				j--;
			}
		}
		int index = j;
		while(j != -1)
		{
			mPlusN[j] = -1;
			j--;
		}
		return index;
	}

}
