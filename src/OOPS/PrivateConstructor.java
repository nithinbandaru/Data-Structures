package OOPS;

public class PrivateConstructor {

	int id;
	private PrivateConstructor(int val)
	{
		System.out.println("constructor called");
		id = val;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateConstructor pc = new PrivateConstructor(1);
		System.out.println(pc.id);

	}

	protected class abc
	{
		
	}
}

