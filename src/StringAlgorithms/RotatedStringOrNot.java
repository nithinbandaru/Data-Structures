package StringAlgorithms;
public class RotatedStringOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		boolean b = stringRotation(s1,s2);
		System.out.println(b);
	}

	private static boolean stringRotation(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length() == s2.length() && (s1+s1).indexOf(s2)!= -1)
		{
			return true;
		}
		
		return false;
	}

}
