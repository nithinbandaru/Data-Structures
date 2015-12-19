package Arrays2;
import java.util.ArrayList;
import java.util.HashSet;


public class UnionAndIntersectionOfSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {1, 2, 4, 5, 6};
		int arr2[] = {2, 3, 5, 7};
		
		int[] union = printUnionOfArrays(arr1, arr2);
		
		for(int i : union)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		ArrayList<Integer> common = printIntersectionOfArrays(arr1, arr2);
		
		for(int i : common)
		{
			System.out.print(i+" ");
		}
		
		

	}

	private static ArrayList<Integer> printIntersectionOfArrays(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i : arr1)
		{
			list.add(i);
		}
		
		ArrayList<Integer> common = new ArrayList<Integer>();
		for(int i : arr2)
		{
			if(list.contains(i)){
				common.add(i);
			}
		}
				
		return common;
	}

	private static int[] printUnionOfArrays(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i : arr1)
		{
			set.add(i);
		}
		
		for(int i: arr2)
		{
			set.add(i);
		}
		
		int[] union = new int[set.size()];
		
		
				
		int index = 0;
		
		for(int k : set)
		{
			union[index++] = k;
		}
		
		return union;
		
	}


}
