package StringAlgorithms;

public class ReverseWordsInASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] sentence = "the sky is blue".toCharArray();
		
		reverseWord(sentence);
		
		System.out.println(sentence);
	}

	private static String reverseWord(char[] sentence) {
		
		int end = sentence.length;
		int start = 0;
		
		for(int i= 0; i<end; i++)
		{
			
			if(sentence[i]== ' ' && i>0)
			{
				reverseString(sentence , start, i-1);
				start = i+1;
			}
			else if(i == end-1)
			{
				reverseString(sentence , start, i);
			}
			
		}
		reverseString(sentence , 0, end-1);
		
		return sentence.toString();
	}
	
	private static void reverseString(char[] str, int start , int end)
	{
		while(start < end)
		{
			swap(str, start, end);
			start++;
			end--;
		}
	}

	private static void swap(char[] str, int start, int end) {

		char temp = str[start];
		str[start] = str[end];
		str[end] = temp;
	}

}
