package General2;
import java.util.HashMap;


public class HexToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String hex = "A";
		double power = 0;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 10);
		map.put("B", 11);
		map.put("C", 12);
		map.put("D", 13);
		map.put("E", 14);
		map.put("F", 15);
		double result = 0;
		for(int i = hex.length() - 1; i >=0 ; i--)
		{
			char ch = hex.charAt(i);
			if(map.containsKey(ch+""))
			{
				System.out.println(map.get(ch+""));
				result = result + Math.pow(16, power) *map.get(ch+"");
				
			}
			else
			{
				result = result + Math.pow(16, power) * (ch - '0');
			}
			
			power++;
		}
		
		System.out.println("Decimal: " + result);
		
		String binary = "";
		
		int hexa = (int)result;
		while(hexa != 0)
		{
			binary = hexa %2 + binary;			
			hexa = hexa /2 ;
			
		}
		System.out.println();
		System.out.println(binary);
	}
	
	
}
