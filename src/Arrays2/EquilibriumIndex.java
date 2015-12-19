package Arrays2;

public class EquilibriumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {-7, 1, 5, 2, -4, 3, 0};
		
		findEquilibriumIndex(arr);
	}

	private static void findEquilibriumIndex(int[] arr) {
		// TODO Auto-generated method stub
		
		int sumArray = 0;
		int leftSum = 0;
		
		for(int i : arr)
		{
			sumArray += i ;
		}
		System.out.println("Sum of array Elements: " + sumArray);
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			
			sumArray = sumArray - arr[i];
			
			if(leftSum == sumArray)
			{
				System.out.println("Equilibrium Index: " + i);
			}
			
			leftSum = leftSum + arr[i];
			
			
		}
		
	}

}
