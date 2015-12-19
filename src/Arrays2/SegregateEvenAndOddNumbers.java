package Arrays2;

public class SegregateEvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {12, 34, 45, 9, 8, 90, 3};
		
		segregateEvenOdd(arr);
		
		for(int i = 0; i< arr.length ; i++)
		{
			System.out.print(arr[i] +" ");
		}

	}
	
	
	private static void segregateEvenOdd(int[] arr) {
		// TODO Auto-generated method stub
		
		int left = 0 ;
		int right = arr.length-1;
		while( left < right )
		{
			while(arr[left] % 2 == 0 && left < right)
			{
				left++;
			}
			//System.out.println("left out ");
			while(arr[right] % 2 == 1 && left < right)
			{
				right--;
			}
			//System.out.println("right out ");
			if(left < right)
			{
				swap(arr[left] , arr[right]);
			}
				
			System.out.println("left: "+ left +" right "+ right);
		}
		
	}


	public static void swap(int a, int b)
	{
		int temp ;
		temp = a;
		a = b;
		b = temp;
	}

}
