package Arrays;
import java.util.ArrayList;
import java.util.List;


public class MaxMinInArrayPairWiseComparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1000, 11, 125, 330, 3000};
		
		List<Integer> minMax = minMaxPairWiseComparisons(arr);

		System.out.println("Min: " + minMax.get(0));
		System.out.println("Max: " + minMax.get(1));
		
	}

	private static List<Integer> minMaxPairWiseComparisons(int[] arr) {

		int min = 0 ; int max = 0;
		List<Integer> minMax = new ArrayList<Integer>();
		
		int n = arr.length;
		
		int i =0 ;
		
		if(n%2 == 0)
		{
			if(arr[0] > arr[1])
			{
				max = arr[0];
				min = arr[1];
			}
			else
			{
				min = arr[0];
				max = arr[1];
			}
			i = 2;
		}
		else
		{
			max = arr[0];
			min = arr[0];
			i = 1;
		}
		
		while(i<n-1)
		{
			
			if(arr[i] > arr[i+1])
			{
				if(arr[i] > max)
				{
					max = arr[i];
				}
				if(arr[i+1] < min)
				{
					min = arr[i+1];
				}
			}
			else
			{
				if(arr[i+1] > max)
				{
					max = arr[i+1];
				}
				if(arr[i] < min)
				{
					min = arr[i];
				}
			}
			
			i = i+2;
		}
		
		minMax.add(min);
		minMax.add(max);
		
		return minMax;
	}

}
