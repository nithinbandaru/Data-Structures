package Arrays2;

public class CountOccurencesOfANumberSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,2,2,3,3,3,3,4,5};
		int numToFind = 3;
		int i = lowIndexOfElement(arr, numToFind);
		int j = highIndexOfElement(arr,numToFind);
		System.out.println("High Index: "+j + "Low Index: "+i +" count: "+(1+j-i));

	}

	private static int highIndexOfElement(int[] arr, int find) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = arr.length - 1;
		//System.out.println("High "+high);
		int index = -1;
		while(low<=high)
		{
			System.out.println("High "+high);
			System.out.println("low "+low);
			int mid = (low + high)/2;
			System.out.println("mid "+mid +"arr" + arr[mid]);
			if(arr[mid]== find)
			{
				System.out.println("founnd");
				index = mid;
				low = mid+1;
			}
			else if(arr[mid]>find)
			{
				high = mid-1;
			}
			else
			{
				low = mid + 1;
			}
		}
		return index;
	}

	private static int lowIndexOfElement(int[] arr, int find) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = arr.length - 1;
		int index = -1;
		while(low<=high)
		{
			int mid = (low + high)/2;
			if(arr[mid]== find)
			{
				index = mid;
				high = mid-1;
			}
			else if(arr[mid]>find)
			{
				high = mid-1;
			}
			else
			{
				low = mid + 1;
			}
		}
		
		return index;
	}

}
