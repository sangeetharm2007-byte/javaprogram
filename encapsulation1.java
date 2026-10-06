package program1;

class Parent {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class encapsulation1 extends Parent {
	public static void main(String[] args) {
		encapsulation1 bb = new encapsulation1();
		bb.setName("AnanyaBhagath");
		String ss = bb.getName();
		System.out.println(ss);
	}
}