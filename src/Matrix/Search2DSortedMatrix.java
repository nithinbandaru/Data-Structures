package Matrix;

public class Search2DSortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = { {10, 20, 30, 40},
                		   {15, 25, 35, 45},
                		   {27, 29, 37, 48},
                		   {32, 33, 39, 50},
              			 };

		// STAIR CASE ALGORITHM
		boolean found = search2DMatrix(matrix , 28);
		System.out.println("found : " + found);
	}

	private static boolean search2DMatrix(int[][] matrix, int key) {
		// TODO Auto-generated method stub
		
		int rowMax = matrix.length-1;
		int colMax = matrix[0].length-1;
		
		if( key < matrix[0][0] || key > matrix[rowMax][colMax])
		{
			return false;
		}
		int row = 0 ;
		int col = colMax;
		while (row <= rowMax && col >=0)
		{
			System.out.println("Now at " + matrix[row][col]);
			if( key < matrix[row][col])
			{
				col--;
			}
			else if (key > matrix[row][col])
			{
				row++;
			}
			else
			{
				return true;
			}
		}		
		
		return false;
	}

}
