package project;

public class parameters {
	void add()
	{
		System.out.println("method 1");
	}
	void add(String a)
	{
		System.out.println("method 2");
	}
	public static void main(String[]args)
	{
		parameters address=new parameters();
		address.add();
		address.add("hello");
	}
	

}
