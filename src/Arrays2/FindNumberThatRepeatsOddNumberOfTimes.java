package Arrays2;
import java.util.HashMap;


public class FindNumberThatRepeatsOddNumberOfTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 2, 1, 4, 5, 3, 4, 5};
		int[] arr2 = { 1, 2, 2, 2, 1, 4, 4, 3, 4, 5};
		int result = 0;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			result = result ^ arr[i];
		}
		
		System.out.println("Number that repeats Odd times: " + result);
		
		findRepeatElement(arr2, 2);

	}

	private static void findRepeatElement(int[] arr , int oddOrEven) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i =0 ; i< arr.length ; i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		
		
		for(int i = 0 ; i< arr.length ; i++)
		{
			if(map.get(arr[i]) % 2 == 0 && oddOrEven % 2 == 0)
			{
				System.out.println("Even Repeat Element: "+ arr[i]);
				return;
			}
			if(map.get(arr[i]) % 2 == 1 && oddOrEven % 2 == 1)
			{
				System.out.println("Odd Repeat Element: "+ arr[i]);
				return;
			}
			
		}
	}
}
