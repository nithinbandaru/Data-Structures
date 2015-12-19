package Arrays2;

public class Segregate0and1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 1 , 0 ,1 , 0 , 1};
		int numOfZeros = 0;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] == 0)
			{
				numOfZeros++;
			}
		}
		
		System.out.println("No of zeros: " + numOfZeros);
		
		for(int i = 0; i < arr.length ; i++)
		{
			if(i < numOfZeros)
			{
				arr[i] = 0;
			}
			else
			{
				arr[i] = 1;
				
			}
			
		}
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
	
		

	}

}
