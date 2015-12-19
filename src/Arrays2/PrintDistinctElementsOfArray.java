package Arrays2;
import java.util.HashSet;


public class PrintDistinctElementsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 10, 9, 45, 2, 10, 10, 45};
		printDistinctElements(arr);
		

	}

	private static void printDistinctElements(int[] arr) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<arr.length;i++)
		{
			if(!set.contains(arr[i]))
			{
				set.add(arr[i]);
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}

}
