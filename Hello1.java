package jawa;

public class Hello1 {
	public static void main(String... args) {
		System.out.println("Start");
		try {
			int a=10/1;
			int[] ab= {10,20,30};
			System.out.println(ab[0]);
			System.out.println(ab[1]);
			System.out.println(ab[2]);
			System.out.println(ab[3]);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic handle"+ e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index handle"+ e);
		}
		catch (Exception e) {
			System.out.println("Exception handle" + e);
		}
		
		System.out.println("End");
	}

}

