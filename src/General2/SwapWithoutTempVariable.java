package General2;

public class SwapWithoutTempVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 9; 
		int b = 4;
		swap(9,4);
		swapWithXor(9,4);
	}

	private static void swapWithXor(int i, int j) {
		// TODO Auto-generated method stub
		
		System.out.println("Before Swapping: "+ " i = " + i +" j = " + j);
		
		i = i ^ j;
		j = i ^ j;
		i = i ^ j;
		
		System.out.println("Afterf  Swapping: "+ " i = " + i +" j = " + j);
		
		
	}

	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		
		System.out.println("Before Swapping: "+ " i = " + i +" j = " + j);
		
		i = i - j;
		j = i + j;
		i = j - i;
		
		System.out.println("After Swapping: "+ " i = " + i +" j = " + j);
		
	}

}
