package project;

public class oops {
	void add(String s)
	{
		System.out.println("method 1");
	}
	void add(int a,int b)
	{
		System.out.println("method 2");
	}
	public static void main(String args[])
	{
		oops address= new oops();
		address.add("hello");
		address.add(2, 4);
	}

}
