abstract class atm {
	abstract void withdraw();
}
abstract class Atm1 extends atm{
	abstract void deposite();
}
public class Xyz extends atm{
	void withdraw() {
		System.out.println("withdraw");
	}
	void deposite() {
		System.out.println("deposite");
	}
	public static void main (String[]args) {
		Xyz ff = new Xyz();
		ff.withdraw();
		ff.deposite();
	}
}