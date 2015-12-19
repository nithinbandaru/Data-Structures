package Matrix;

public class Array2Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = { 1, 2, 3, 4, 5, 6, 7, 8};		
		int noOfRows = 3;
		boolean rowWise = false;
		printMatrix(myArray, noOfRows, rowWise);

	}

	private static void printMatrix(int[] myArray, int noOfRows, boolean rowWise) {
		// TODO Auto-generated method stub
		
		int count = 1;
		if(rowWise)
		{
			for(int i=0; i<myArray.length; i++)
			{
				if(count % noOfRows == 0)
				{
					System.out.println(myArray[i]);
					
				}
				else
				{
					System.out.print(myArray[i]+" ");
				}
				count++;
			}
			

		}
		else
		{
			//{ 1, 2, 3, 4, 5, 6, 7, 8};
			
			count = 0;
			int index = 0;
			while(count+noOfRows*index < myArray.length)
			{
				System.out.print(myArray[count+noOfRows*index]+" ");
				index++;
				if(index*noOfRows > myArray.length)
				{
					System.out.println();
					count++;
					index=0;
				}
			}
			
		}
				
	}

}
