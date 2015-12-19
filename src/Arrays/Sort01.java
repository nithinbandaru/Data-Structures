package Arrays;
public class Sort01 {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
		printArray(arr);
		segregate0and1(arr);
		printArray(arr);

	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static void segregate0and1(int[] arr) {

		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				index++;
			} else {
				arr[i] = 0;
			}
		}
		
		while (index < arr.length) {
			arr[index] = 1;
			index++;
		}

	}

}
