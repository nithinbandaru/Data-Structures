package Arrays;
import java.util.Arrays;

public class TwoElementsWhoseSumIsCloseToZero {

	public static void main(String[] args) {

		int arr[] = { 1, 60, -10, 70, -80, 85 };

		int minSum = zeroSum(arr);

	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static int zeroSum(int[] arr) {

		Arrays.sort(arr);
		printArray(arr);
		
		int l = 0;
		int r = arr.length - 1;

		int sum = 0;
		int minSum = Integer.MAX_VALUE;

		int min_l = l;
		int min_r = r;

		while (l < r) {
			sum = arr[l] + arr[r];
			if (Math.abs(sum) < Math.abs(minSum)) {
				minSum = sum;
				min_l = l;
				min_r = r;
			}
			if (sum < 0) {
				l++;
			} else {
				r--;
			}

		}

		System.out.println(arr[min_l] + " + " + arr[min_r] + " = " + minSum);

		return minSum;
	}

}
