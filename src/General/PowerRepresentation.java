package General;

public class PowerRepresentation {

	
	//  Check if a number can be expressed as x^y (x raised to power y)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 48 ;
		boolean b = XRaisetoPowerY(num);
		System.out.println("Is Power " + b);
	}

	private static boolean XRaisetoPowerY(int num) {
		// TODO Auto-generated method stub
		
		
		if( num == 1)
		{
			return true;
		}
		
		for(int x = 2 ; x <= Math.sqrt(num); x++)
		{
			int y = 2;
			double power = Math.pow(x, y);
			
			while(power <= num && power > 0)
			{
				if(power == num)
				{
					System.out.println(x + "^" + y);
					return true;
				}
				y++;
				power = Math.pow(x, y);				
			}
			
		}
		
		return false;		
		
	}

}
 