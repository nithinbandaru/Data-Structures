package Arrays2;
import java.util.Arrays;


public class ArraySortInWaveForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		printWaveSort(arr);
		System.out.println(Arrays.toString(arr));
}

	private static void printWaveSort(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length-1;i=i+2)
		{
			swapElements(arr,i,i+1);
		}
	}
	
	public static void swapElements(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
