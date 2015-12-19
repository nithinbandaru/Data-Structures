package Arrays2;

public class FindSmallestNumberThatCannotBeRepresentedAsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {1, 3, 4, 5};
		int arr[] = {1, 1, 1, 1};
		System.out.println(" Smallest Element : " + findSmallestNumber(arr));
		

	}

	private static int findSmallestNumber(int[] arr) {
		// TODO Auto-generated method stub
		int res = 1 ;
		for(int i = 0; i < arr.length && arr[i]<=res; i++){
			res = res + arr[i];
			//System.out.println("i "+i+" res: "+res);
		}
		return res;
		
	}

}
