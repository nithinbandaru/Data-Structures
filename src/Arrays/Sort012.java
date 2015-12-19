package Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		sort(arr);
		
		for(int i = 0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		
		int low = 0; 
		int high = arr.length -1 ;
		int mid = 0;
		int temp = 0;	
		while(mid<= high)
		{
			switch(arr[mid])
			{
				case 0:
					temp = arr[mid];
					arr[mid] = arr[low];
					arr[low] = temp;
					low++;
					mid++;
					break;
				case 1:
					mid++;
					break;
				case 2:
					temp = arr[mid];
					arr[mid] = arr[high];
					arr[high] = temp;
					high--;
					break;

			}
			
		}
		
	}
	
	

}
