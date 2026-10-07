package program1;

public class student {
	String name;
	int age;
	void introduction() {
		System.out.println(""+ name + " my age is "+age );
	}

public static void main(String[]args) {
student ab=new student() ;
ab.name="ananya";
ab.age=20;
ab.introduction();
 }
}
