package project;

//OOPS
// inheritance , ploymor 1) over laod / overrding
//, encap , abst

abstract class Atm {
	abstract void withdraw();
	abstract void depoiste();
}
public class Abc extends Atm {
	void withdraw() {
		System.out.println("withdraw");
	}
	void depoiste() {
		System.out.println("Deposite");
	}
	public static void main(String[] args) {
		Abc ff = new Abc();
		ff.withdraw();
		ff.depoiste();
	}
}

