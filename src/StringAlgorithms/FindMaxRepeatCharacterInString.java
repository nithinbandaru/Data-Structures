package StringAlgorithms;

public class FindMaxRepeatCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nithin";
		printMaxRepeatCharacter(str);
	}

	private static void printMaxRepeatCharacter(String str) {
		// TODO Auto-generated method stub
		
		int ascii[] = new int[256];
		
		for(int i=0; i<str.length();i++)
		{
			ascii[str.charAt(i)]++;
		}
		
		int max_repeat_count = 0;
		int max_index =0 ;
		
		for(int j=0; j<ascii.length;j++)
		{
			if(max_repeat_count < ascii[j])
			{
				max_repeat_count = ascii[j];
				max_index = j;
			}			
		}
		char ch = (char) max_index;
		System.out.println("Max Repeating Character is "+ch+" It repeats for  "+ max_repeat_count+" times");
		
	}

}
