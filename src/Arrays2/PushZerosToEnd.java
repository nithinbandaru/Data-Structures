package Arrays2;

public class PushZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
		pushZeros(arr);
		for(int j =0 ; j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
		
	}

	private static void pushZeros(int[] arr) {
		// TODO Auto-generated method stub
		int index = 0;
		for(int i =0 ; i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[index++] = arr[i];
			}
		}
		while(index<arr.length)
		{
			arr[index++] = 0 ;
		}
		
	}

}
