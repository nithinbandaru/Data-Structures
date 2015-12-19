package Arrays;
import java.util.HashSet;


public class CheckDuplicatedWithinKDistance {

	public static void main(String[] args) {

		int arr[] = {10, 5, 3, 4, 7, 5, 6};
		
		boolean dup = CheckDuplicatedWithinK(arr, 3);
		System.out.println(dup);
		
	}

	private static boolean CheckDuplicatedWithinK(int[] arr, int k) {
		
		HashSet<Integer> set = new HashSet<>();
		 
        // Traverse the input array
        for (int i=0; i<arr.length; i++)
        {
            // If already present n hash, then we found 
            // a duplicate within k distance
            if (set.contains(arr[i]))
               return true;
 
            // Add this item to hashset
            set.add(arr[i]);
 
            // Remove the k+1 distant item
            if (i >= k)
              set.remove(arr[i-k]);
        }
        return false;
		
	}

}
