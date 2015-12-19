package OOPS;

public class CopyObjects {

	static int test = 123;
	int id;
	String name;
	static String url = "google";
	CopyObjects(int val, String s){
		id = val;
		name = s;
		
	}
	CopyObjects(CopyObjects c)
	{
		id = c.id;
		name = c.name;
	}
	
	static
	{
		System.out.println("static block is invoked");
	}
	
	public void display()
	{
		url = "yahoo";
		System.out.println(id+" "+name);
		System.out.println("url:"+url);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test: "+test);

		CopyObjects c1 = new CopyObjects(1,"nitro");
		c1.display();
		CopyObjects c2 = new CopyObjects(c1);
		c2.display();
		
	}


}
