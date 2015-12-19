package Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionAndIntersectionUnsortedArrays {

	public static void main(String[] args) {

		int arr1[] = { 7, 1, 5, 2, 3, 6 };
		int arr2[] = { 3, 8, 6, 20, 7 };

		printArray(arr1);
		printArray(arr2);
		
		Set<Integer> union = UnionOfArrays(arr1, arr2);
		System.out.println("Union : " + union);

		Set<Integer> intersection = IntersectionOfArrays(arr1, arr2);
		System.out.println("Intersection : " + intersection);


	}

	private static Set<Integer> IntersectionOfArrays(int[] arr1, int[] arr2) {

		Set<Integer> firstArray = new HashSet<Integer>();
		Set<Integer> intersection = new HashSet<Integer>();
		for(int i=0; i<arr1.length; i++)
		{
			firstArray.add(arr1[i]);
		}
		
		for(int i=0; i<arr2.length; i++)
		{
			intersection.add(arr2[i]);			
		}
		firstArray.retainAll(intersection);
		return firstArray;
		
	}

	private static Set<Integer> UnionOfArrays(int[] arr1, int[] arr2) {

		Set<Integer> union = new HashSet<Integer>();
		for(int i=0; i<arr1.length; i++)
		{
			union.add(arr1[i]);
		}
		
		for(int i=0; i<arr2.length; i++)
		{
			if(!union.contains(arr2[i]))
			{
				union.add(arr2[i]);
			}
			
		}
		
		return union;
	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
