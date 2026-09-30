package project;
class demo1 {
	void marry()
	{
		System.out.println("family selection" );
	}
	void properties()
	{
		System.out.println("property");
	}
}
public class demo extends demo1
{
	void marry()
	{
		System.out.println("own selection");
	}
	public static void main(String[]args)
	{
	demo  bb = new demo();
			bb.marry();
	bb.properties();
	}
}



