package OOPS;

public class MethodOverload {
	
	void sum(int a,long b){System.out.println("a method invoked");}  
	void sum(long a,int b){System.out.println("b method invoked");}  
	void sum(int a,int b){System.out.println("c method invoked");}  
	  
	MethodOverload()
	{
		System.out.println("object created");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverload ml = new MethodOverload();
		ml.sum(20, 20);
		
	}

}
