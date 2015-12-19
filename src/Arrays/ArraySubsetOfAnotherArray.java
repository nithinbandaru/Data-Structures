package Arrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class ArraySubsetOfAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {11, 1, 13, 21, 3, 7};
		int[] arr2 = {11, 3, 7, 1};
		int arr3[] = {10, 5, 2, 23, 19} ; 
		int arr4[] = {19, 5, 3} ;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		printArray(arr1);
		printArray(arr2);
		
		boolean subset1 = IsSubsetUsingHashSet(arr3, arr4);
		System.out.println("Is Subset : " + subset1);
		

		boolean subset2 = IsSubsetUsingSorting(arr1, arr2);
		System.out.println("Is Subset by sorting  : " + subset2);
		
		
	}
	
	private static void printArray(int[] arr) {
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}


	private static boolean IsSubsetUsingSorting(int[] arr1, int[] arr2) {

		int size1 = arr1.length ;
		int size2 = arr2.length ;
		
		if(size2 == 0)
		{
			return true;
		}
		
		if(size1 < size2)
		{
			return false;
		}
		
		int i=0 ; int j = 0;
		
		while(i < size1 && j < size2)
		{
			if(arr1[i] < arr2[j])
			{
				i++;
			}
			else if(arr1[i] == arr2[j])
			{
				j++;
				i++;
			}
			else if ( arr1[i] > arr2[j])
			{
				return false;
			}
		}
		
		System.out.println(i +" " + j);
		
		if(j < size2){
			return false;
		}
		
		return true;
	}

	private static boolean IsSubsetUsingHashSet(int[] arr1, int[] arr2) {

		int size1 = arr1.length ;
		int size2 = arr2.length ;
		
		if(size2 == 0)
		{
			return true;
		}
		
		if(size1 < size2)
		{
			return false;
		}
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0 ; i < arr1.length ; i++)
		{
			set.add(arr1[i]);
		}
		
		for(int j=0 ; j < arr2.length ; j++)
		{
			if(!set.contains(arr2[j]))
			{
				return false;
			}
		}
		
		return true;
	}

}
