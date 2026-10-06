package program1;


	class parent
	{
		private int a;
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a=a;
		}
	}

class encapsulation extends parent
	{
		public static void main(String[]args) {
			encapsulation bb = new encapsulation();
			bb.setA(8);
			int ss= bb.getA();
			System.out.println(ss);
		}
	}



