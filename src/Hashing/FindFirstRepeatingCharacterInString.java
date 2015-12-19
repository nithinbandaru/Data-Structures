package Hashing;

public class FindFirstRepeatingCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="nithkli";
		char firstRepeatChar = getFirstRepeatCharacter(str);
		System.out.println(firstRepeatChar);
	}

	private static char getFirstRepeatCharacter(String str) {
		// TODO Auto-generated method stub
		int[] count = new int[256];
		char[] ch = str.toCharArray() ;
		char repeatChar = '#';
		
		for(int i =0 ; i<256;i++)
		{
			count[i] = 0;
		}
		int j = 0;
		for(; j < ch.length; j++)
		{
			if(count[ch[j]] == 1)
			{
				repeatChar = ch[j];
				break;
			}
			else
			{
				count[ch[j]]++;
			}
			
			
		}
		if(j==ch.length)
		{
			System.out.println("No Repeat characters");
		}
		return repeatChar;
	}

}
