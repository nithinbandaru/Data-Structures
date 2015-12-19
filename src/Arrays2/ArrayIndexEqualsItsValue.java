package Arrays2;

public class ArrayIndexEqualsItsValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = {-4,-2,2,4,6,9};
		
		for(int i = 0 ; i<myArray.length ; i++)
		{
			if(myArray[i] == i)
			{
				System.out.print(i+" ");
			}
		}

	}

}
