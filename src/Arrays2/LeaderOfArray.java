package Arrays2;

public class LeaderOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {16, 17, 4, 3, 5, 2};
		
		printLeader(arr);

	}

	private static void printLeader(int[] arr) {
		// TODO Auto-generated method stub
		
		int leader = arr[arr.length - 1];
		System.out.print(leader+" ");
		
		for(int i = arr.length - 2; i>=0 ; i--)
		{
			if(arr[i] > leader)
			{
				
				leader = arr[i];
				System.out.print(leader+" ");
			}
			
			
		}
		
	}

}
