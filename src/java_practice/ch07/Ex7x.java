package java_practice.ch07;

public class Ex7x {

	public static void main(String[] args) {
		Professor pf = new Professor("Àü»êÇÐ°ú", "È«¼º·æ");
		System.out.println(pf.dept);
		System.out.println(pf.name);
	}

}
class Person {
	String name;

	Person(String name) {
		this.name = name;
	}
	
}

class Professor extends Person {
	String dept;

	public Professor(String dept, String name) {
		super(name);
		this.dept = dept;
	}
}

