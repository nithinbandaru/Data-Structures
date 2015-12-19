package Arrays2;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[4];		
		arr1[0]= 6;
		arr1[1]= 7;
		arr1[2]= 8;
		arr1[3]= 9;
		
		int[] arr2 = new int[9];		
		arr2[0]= 1;
		arr2[1]= 2;
		arr2[2]= 3;
		arr2[3]= 4;
		arr2[4]= 5;
		printArray2(arr2);
		System.out.println();
		mergeArrays(arr1, arr2);
	}

	private static void mergeArrays(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int i = arr1.length-1;// 1 
		int j = arr2.length-1;// 4 
		int m = (j-i)-1;// 2
		
		while (i>=0 && m >= 0 )
		{
			if(arr1[i] < arr2[m])
			{
				arr2[j] = arr2[m];
				m--;
			}
			else
			{
				arr2[j] = arr1[i];
				i--;
			}
			j--;
			System.out.println("j "+j + " i "+i+ " m "+m);
		}
		if(m<0)
		{
			System.out.println("j "+j + " i "+i);
			while(j>=0 & i>=0)
			{
				arr2[j--]= arr1[i--];
				
			}
		}
		
		printArray2(arr2);
	}

	private static void printArray2(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
