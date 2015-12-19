package Arrays;

import java.util.ArrayList;

public class MinimumJumpsToReachEndOfArray {

	public static void main(String[] args) {

		// int arr[] = {1, 3, 6, 1, 0, 9};
		//int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		
		int arr[] = { 5, 6, 0 , 4, 2, 4 , 1, 0 , 0 , 4};
		
		int jumps = minJumps(arr);
		System.out.println(jumps);
	}
	
	public static int minJumps(int arr[])
	{
		int size = arr.length;
	    int[] jumps = new int[size];  // jumps[n-1] will hold the result
	    int i, j;
	 
	    if (size == 0 || arr[0] == 0)
	        return Integer.MAX_VALUE;
	 
	    jumps[0] = 0;
	    ArrayList<Integer> index = new ArrayList<Integer>();
	    
	    for (i = 1; i < size; i++)
	    {
	        jumps[i] = Integer.MAX_VALUE;
	        for (j = 0; j < i; j++)
	        {
	            if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE)
	            {
	                 jumps[i] = Math.min(jumps[i], jumps[j] + 1);
	           
	                 break;
	            }
	        }
	    }
	    for(int k = 0 ; k < jumps.length-1; k++)
	    {
	    	//System.out.print(jumps[k] + " ");
	    	if(jumps[k] != jumps[k+1])
	    	{
	    		System.out.print(k + " ");
	    	}
	    }
	    System.out.println(jumps[size-1]);
	    System.out.println();
	    return jumps[size-1];
	}

}
