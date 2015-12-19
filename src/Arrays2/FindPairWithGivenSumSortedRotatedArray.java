package Arrays2;

public class FindPairWithGivenSumSortedRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {11, 15, 6, 8, 9, 10};
		int sum = 16;
		
		printPair(arr,sum);
		
		
	}

	private static void printPair(int[] arr, int sum) {
		// TODO Auto-generated method stub
		
		int minIndex = 0;
		int maxIndex = 0;
		int minElement = arr[0];
		int maxElement = arr[0];
		
		
		
		for(int i = 1; i<arr.length ; i++)
		{
			
			if(arr[i] < minElement)
			{
				minElement = arr[i];
				minIndex = i;
				
			}
			if(arr[i] > maxElement)
			{
				maxElement = arr[i];
				maxIndex = i;
			}
			
		}
		
		System.out.println(" minIndex: " + minIndex +": " + arr[minIndex]+ " maxIndex: "+ maxIndex +" " + arr[maxIndex]);
		
		//int[] arr = {11, 15, 6, 8, 9, 10};
		int i = 0;
		int j = arr.length-1;
		while(i< maxIndex  && j > minIndex )
		{
			System.out.println(i + " $ " + j);
			if(arr[i] + arr[j] < sum )
			{
				i ++ ;
			}
			else if(arr[i] + arr[j] > sum)
			{
				j--;
			}
			else 
			{
				System.out.println(arr[i] + " + " + arr[j] + "= " + sum);
			}
		}
	}

}
