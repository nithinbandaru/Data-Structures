package StringAlgorithms;
public class LexicographicOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abe";
		String str2 = "abe";

		System.out.println(printLexicoOrder(str1, str2));

	}

	private static String printLexicoOrder(String str1, String str2) {
		// TODO Auto-generated method stub
		// String str = "";
		
		int a = str1.length();
		int b = str2.length();
		int c = (a < b) ? a : b;
		if (str1.isEmpty() || str2.isEmpty()) {
			System.out.println("No string to compare");
			return null;
		}
		for (int i = 0; i < c; i++) {
			if (str1.charAt(i) < str2.charAt(i)) {
				System.out.println("String 1 is smaller");
				return str1;
			} else if (str1.charAt(i) > str2.charAt(i)) {
				System.out.println("String 2 is smaller");
				return str2;
			}

		}
		return str1;
	}

}
