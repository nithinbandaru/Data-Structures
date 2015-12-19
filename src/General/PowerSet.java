package General;
import java.util.ArrayList;
import java.util.List;

public class PowerSet {

	public static void main(String[] args) {

		char[] a = { 'a', 'b', 'c', 'd' };
		generatePermutations(a);
	}

	public static void generatePermutations(char inputArray[]) {
		if (inputArray.length > 0) {

			for (int i = 1; i < Math.pow(2, inputArray.length); i++) {
				
				int binaryRepresentation = Integer.parseInt(convertToBinary(i));
				
				String paddedBinaryString = String.format("%0"
						+ inputArray.length + "d", binaryRepresentation);
				
				for (int j=0; j< inputArray.length; j++)
					if (paddedBinaryString.charAt(j) == '1')
						System.out.print(inputArray[j]);
				
				System.out.println(" ==== " + i);
			}
		}

	}

	private static String convertToBinary(int i) {
		int remainder=0, dividend=i;
		String s = "";
		while (dividend > 0) {
			remainder = dividend % 2;
			dividend = dividend / 2;
			s = Integer.toString(remainder) + s;
		}
		return s;
	}

}
