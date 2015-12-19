package Arrays;

public class MajorityElementBoyerMooreVotingAlgo {

	// Time  = O(n)
	// Space = O(1)
	public static void main(String[] args) {
		
		int[] arr  = {3 ,3 , 6 ,2, 4 ,4 ,2 ,4 ,4};
		
		Integer majorityElement = getMajorityElement(arr);
		System.out.println("Majority Element : " + majorityElement);		

	}

	private static Integer getMajorityElement(int[] arr) {
				
		// 1. Finding the candidate
		int count = 0 ;
		Integer candidate = null;
		
		for(int i = 0 ;i < arr.length ; i++)
		{
			if(count==0)
			{
				candidate = arr[i];
				count = 1;
				continue;				
			}
			else
			{
				
				if(arr[i] == candidate)
				{
					count++;
				}
				else
				{
					count--;
				}				
			}
		}
		
		if(count==0)
		{
			return null;
		}
		
		// 2. checking if candidate is majority element
		count = 0;
		
		for(int j=0; j < arr.length; j++)
		{
			if(arr[j] == candidate)
			{
				count++;
			}
		}
		
		if(count > arr.length/2 )
		{
			return candidate;
		}		
		return null;
	}

	

	

}
