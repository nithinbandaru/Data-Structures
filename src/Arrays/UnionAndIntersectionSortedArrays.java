package Arrays;
import java.util.ArrayList;
import java.util.List;

public class UnionAndIntersectionSortedArrays {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 4, 5, 6 };
		int arr2[] = { 2, 3, 5, 7 };

		printArray(arr1);
		printArray(arr2);
		List<Integer> union = UnionOfArrays(arr1, arr2);
		System.out.println("Union : " + union);

		List<Integer> intersection = IntersectionOfArrays(arr1, arr2);
		System.out.println("Intersection : " + intersection);

		
	}

	private static List<Integer> IntersectionOfArrays(int[] arr1, int[] arr2) {
		
		int m = arr1.length;
		int n = arr2.length;
		List<Integer> intersection = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while (i < m && j < n) {

			if(arr1[i] <arr2[j])
			{	
				i++;
			}
			else if(arr1[i] > arr2[j])
			{				
				j++;
			}
			else
			{
				intersection.add(arr1[i]);
				i++;
				j++;
			}
		}
		
		return intersection;
	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static List<Integer> UnionOfArrays(int[] arr1, int[] arr2) {

		int m = arr1.length;
		int n = arr2.length;
		List<Integer> union = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while (i < m && j < n) {

			if(arr1[i] <arr2[j])
			{
				union.add(arr1[i]);
				i++;
			}
			else if(arr1[i] > arr2[j])
			{
				union.add(arr2[j]);
				j++;
			}
			else
			{
				union.add(arr1[i]);
				i++;
				j++;
			}
		}
		while (i < m )
		{
			union.add(arr1[i]);
			i++;
		}
			
		while (j < n)
		{
			union.add(arr2[j]);
			j++;
		}

		return union;
	}

}
