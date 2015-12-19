package GreedyAlgs;
import java.util.ArrayList;


public class MinimumNumberOfCoinsAsChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int deno[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
		int value = 93;
		
		printCoinDenominations(deno, value);

	}

	private static void printCoinDenominations(int[] deno, int value) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = deno.length;
		for(int i = n-1 ; i >=0 ; i--)
		{
			while(deno[i] <= value)
			{
				list.add(deno[i]);
				value = value - deno[i];
			}
			if(value == 0 )
			{
				break;
			}
		}
		
		for(int i : list)
		{
			
			System.out.print(i + "--");
		}
		
	}

}
