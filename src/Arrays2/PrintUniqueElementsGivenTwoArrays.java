package Arrays2;
import java.util.HashSet;


public class PrintUniqueElementsGivenTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 3, 5, 6, 7, 8 };
		int[] arr2 = { 2, 4, 5, 8, 9, 10 };
		HashSet<Integer> set = new HashSet<Integer>();
		int i = 0;
		int j = 0;
		while(i<arr1.length && j < arr2.length)
		{
			if(arr1[i] == arr2[j])
			{
				set.remove(arr1[i]);
				i++;
				j++;
				
			}
			else if (arr1[i]< arr2[j])
			{
				set.add(arr1[i]);
				i++;
			}
			else
			{
				set.add(arr2[j]);
				j++;
			}
		}
		
		for(int k: set)
		{
			System.out.print(k+" ");
		}

	}

}
