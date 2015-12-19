package General2;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String binary = "";
		
		int decimal = 8;
		while(decimal != 0)
		{
			binary = decimal %2 + binary;			
			decimal = decimal /2 ;
			
		}
		System.out.println(binary);


	}

}
