package Arrays;
import java.util.HashSet;


public class PrintFirstRepeatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,2,1,2,2,3};
		printFirstRepeat(arr);
		

	}
	
	private static void printFirstRepeat(int[] arr) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		
		int repeatIndex = -1;
		for(int i=arr.length-1; i>=0;i--)
		{
			if(!hs.contains(arr[i]))
			{
				hs.add(arr[i]);
			}
			else
			{
				repeatIndex = i;
			}
		}
		System.out.println("Repeat Element : "+arr[repeatIndex]);
		
		
	}


}
