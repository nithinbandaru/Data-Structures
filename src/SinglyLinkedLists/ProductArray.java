package SinglyLinkedLists;

public class ProductArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 3, 5, 6, 2};
		productArray(arr, arr.length);
				
	}

	public static void productArray(int arr[], int n)
	{
	  int i, temp = 1;
	 
	  int[] prod = new int[n];
	  
	  for(int j = 0 ; j < n ; j++)
	  {
		  prod[j] = 1;
	  }
	  
	  /* In this loop, temp variable contains product of
	    elements on left side excluding arr[i] */
	  for(i=0; i<n; i++)
	  {
	    prod[i] = temp;
	    temp *= arr[i];
	  }
	 
	  /* Initialize temp to 1 for product on right side */
	  temp = 1;
	 
	  /* In this loop, temp variable contains product of
	    elements on right side excluding arr[i] */
	  for(i= n-1; i>=0; i--)
	  {
	    prod[i] *= temp;
	    temp *= arr[i];
	  }
	 
	  /* print the constructed prod array */
	  for (i=0; i<n; i++)
	    System.out.print(prod[i] +" ");
	 
	  return;
	}
	
}
