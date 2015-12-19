package Arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class FindDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 9, 45, 6, 9, 10, 7};
		
		findDuplicatesBruteForce(arr);
		
		findDuplicatesBySorting(arr);
		
		
		int arr2[] = {3,2,1,2,2, 3, 4};
		
		findDuplicatesByHashTable(arr2);
		
		findDuplicatesByNegation(arr2);
		

	}
	
	private static void findDuplicatesByNegation(int[] arr2) {
		// TODO Auto-generated method stub
		
		for ( int i =0 ; i<arr2.length ; i++)
		{
			
			if(arr2[Math.abs(arr2[i])] < 0)
			{
				System.out.println(" Duplicates exist by Negation " + arr2[i]);
				return;
			}
			else
			{
				arr2[arr2[i]] = -arr2[arr2[i]];
			}
			
		}
		
	}

	private static void findDuplicatesByHashTable(int[] arr) {
		// TODO Auto-generated method stub
		
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<arr.length ; i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], 1);
			}
			else
			{
				map.put(arr[i],  map.get(arr[i])+1);
			}
		}
		
		for ( Map.Entry<Integer, Integer> entry : map.entrySet() )
		{
			if(entry.getValue() > 1 )
			{
				System.out.println(" Duplicate is by HashTable " + entry.getKey());
			}
		}
		
		
	}

	private static void findDuplicatesBySorting(int[] arr) {
		// TODO Auto-generated method stub
		
		int[] givenArray = arr;
		Arrays.sort(givenArray);
		
		for ( int i=0; i<givenArray.length - 1 ; i++)
		{
			if( givenArray[i] == givenArray[i+1])
			{
				System.out.println(givenArray[i] + " is the duplicate by sort method ");
				return;
			}
		}

		
	}

	private static void findDuplicatesBruteForce(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i< arr.length ; i++)
		{
			for ( int j = i+1 ; j < arr.length ; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println(arr[i] + " is duplicate by brute force method");
					return;
				}
			}
		}
		
	}


}
