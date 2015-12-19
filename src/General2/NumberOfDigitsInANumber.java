package General2;

public class NumberOfDigitsInANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 234;
		int count = 0;
		while(number != 0)
		{
			number = number /10;
			count ++;
			System.out.println("count: "+count + "number:" +number);
		}
		
		System.out.println("digits: "+ count);

	}

}
