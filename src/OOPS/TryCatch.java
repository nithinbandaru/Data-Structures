package OOPS;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start method");			  
		int b= 2, c =0;
		int a = sum(b, c);

	}

	private static int sum(int b, int c) {
		// TODO Auto-generated method stub
		try {
			int res = b / c ;
			return res;
		} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally
		{
			//return 2;
			 System.out.println("print finally");
		}
		{
			System.out.println("after finally");
		}
		return 1;
		
	}

}
