package General2;

public class FindXLColumnName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int columnNumber = 51;
		printXLCloumnName(columnNumber);
	}

	private static void printXLCloumnName(int columnNumber) {
		// TODO Auto-generated method stub
		
		int remainder = 0, i=0;
		
		char[] colNameArray = new char[256];
		
		while(columnNumber > 0 )
		{
			remainder = columnNumber % 26;
			
			if( remainder == 0 )				
			{
				colNameArray[i++] = 'Z'; 
				columnNumber = columnNumber/26 - 1;
						
			}
			else
			{
				colNameArray[i++] = (char)(remainder + 64);
				columnNumber = columnNumber/26;
			}
			
		}
		
		//char[] array1 = {'h', 'e', 'l', 'k','o'};
		String a = new String(colNameArray);		
		System.out.println(a);
		String b = new StringBuilder(a).reverse().toString();		
		System.out.println("Column Name XL: "+ b);
	}

}
