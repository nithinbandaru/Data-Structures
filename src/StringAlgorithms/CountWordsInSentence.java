package StringAlgorithms;

public class CountWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "    Hello how are you   ";
		
		String[] words = sentence.trim().split(" ");
		System.out.println("No of words: " + words.length);
	}

}
