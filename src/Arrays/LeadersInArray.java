package Arrays;

public class LeadersInArray {

	public static void main(String[] args) {

		int arr[] = {16, 17, 4, 3, 5, 2};
		
		printLeadersInArray(arr);
		
		
		
	}

	private static void printLeadersInArray(int[] arr) {

		int leader = arr[arr.length - 1];
		
		System.out.print(leader + " ");
		
		for(int i = arr.length - 2 ; i >=0 ; i--)
		{
			
			if(leader < arr[i])
			{
				System.out.print(arr[i]+" ");
				leader = arr[i];
			}
			
		}
		
		
		
		
		
	}

}
