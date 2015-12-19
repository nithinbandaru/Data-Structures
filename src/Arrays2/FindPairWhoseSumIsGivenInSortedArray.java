package Arrays2;

public class FindPairWhoseSumIsGivenInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 28, 29, 30, 40};
		int x = 50;
		printPair(arr,x);

	}

	private static void printPair(int[] arr, int sum) {
		// TODO Auto-generated method stub
		int i = 0 , j = arr.length - 1;
		while(i < j)
		{
			if(arr[i]+ arr[j] < sum)
			{
				i++;
			}
			else if ( arr[i] + arr[j] > sum)
			{
				j--;
			}
			else
			{
				System.out.println(arr[i++]+ " " + arr[j--]);
			}
			
		}
		
	}

}
