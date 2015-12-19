package Arrays2;

// http://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/

public class RotationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		
		printArray(arr);
		rotateArray(arr, 2);
		System.out.println();
		System.out.println("After Rotation");
		printArray(arr);

	}

	private static void rotateArray(int[] arr, int rotateBy) {
		// TODO Auto-generated method stub
		reverseArray(arr, 0, rotateBy - 1);
		reverseArray(arr, rotateBy, arr.length - 1);
		reverseArray(arr, 0, arr.length - 1);
		
	}

	private static void reverseArray(int[] arr, int startIndex, int endIndex) {
		// TODO Auto-generated method stub
		
		int temp;
		while(startIndex < endIndex)
		{
			temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
			startIndex++ ;
			endIndex--;
		}
		
	}
	
	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}


}
