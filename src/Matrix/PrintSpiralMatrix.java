package Matrix;

public class PrintSpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {{1,2,3,4} , {12, 13, 14, 5}, {11, 16 ,15 ,6} , {10 , 9 ,8 ,7} };
		int[][] arr2 = { {1,  2,  3,  4,  5,  6},
		        {7,  8,  9,  10, 11, 12},
		        {13, 14, 15, 16, 17, 18}
		    };
		
		
		printSpriral(arr2);
		
	}

	private static void printSpriral(int[][] arr) {
		// TODO Auto-generated method stub
		
		int rowMax = arr.length-1;
		int colMax = arr[0].length-1;
		System.out.println(rowMax + "--" + colMax);
		
		int top = 0 ;
		int right = colMax;
		int bottom = rowMax;
		int left = 0;
		
		int direction = 0;
		
		while( top <= bottom && left <= right)
		{
			if(direction == 0)
			{
				for(int i = left ; i <= right; i++)
				{
					System.out.print(arr[top][i] +" ");					
				}
				top++;
			}
			else if(direction == 1)
			{
				for(int i = top ; i <= bottom; i++)
				{
					System.out.print(arr[i][right] +" ");					
				}
				right--;
			}
			else if(direction == 2)
			{
				for(int i = right ; i >= left ; i--)
				{
					System.out.print(arr[bottom][i] + " ");					
				}
				bottom--;
			}
			else if(direction == 3)
			{
				for(int i = bottom ; i >= top; i--)
				{
					System.out.print(arr[i][left] + " ");					
				}
				left++;
			}
				
			direction = ( direction + 1 ) % 4 ;
		}
		
		
	}

}
