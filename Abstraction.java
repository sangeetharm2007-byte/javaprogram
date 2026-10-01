package project;

class Atm {
	void withdraw() {
		System.out.println(" withdraw logic");
	}
	void depoiste() {
		System.out.println(" depositte logic");
	}
}
public class Abstraction extends Atm{

	public static void main(String[] args) {
		Abstraction  ff = new Abstraction();
ff.withdraw();
ff.depoiste();
	}
}
