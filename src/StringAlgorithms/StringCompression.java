package StringAlgorithms;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="aabcccccddd";
		String compressStr = StringCompressor(str);
		System.out.println("Compressed String: "+compressStr);

	}

	private static String StringCompressor(String str) {
		// TODO Auto-generated method stub
		char[] chArray = str.toCharArray();
		int count = 1;
		char prev = chArray[0];
		StringBuilder buff = new StringBuilder();
		for(int i =1; i<chArray.length;i++)
		{
			if(prev == chArray[i])
			{
				count++;
			}
			else
			{
				buff.append(prev).append(count);
				
				count = 1;
			}
			prev = chArray[i];
		}
		
		buff = buff.append(prev).append(count);
		
		return buff.toString();
	}

}
