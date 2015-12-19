package General2;

public class ShuffleDeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] deck = new int[52];
		
		for(int i = 0; i < deck.length ; i++)
		{
			deck[i] = i;
			//System.out.print(deck[i] +" ");
		}
		
		System.out.println(""+shuffleCards(deck));
 
	}
	
	public static int shuffleCards(int[] cards)
	{
		for(int i= 0; i< cards.length; i++)
		{
			int k = (int)Math.random();
			int temp = cards[k];
			cards[k] = cards[i];
			cards[i] = temp;
		}
		
		return 1;
	}

}
