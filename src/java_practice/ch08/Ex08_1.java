package java_practice.ch08;

class Super {
	int n = 1;
	int a = 14;
	public int getN() {
		return n;
	}
}

class Sub extends Super {
	int n = 9;
	
	public int getN() {
		return n;
	}

	public int getSuperN() {
		return super.getN();
	}
}

public class Ex08_1 {

	public static void main(String[] args) {
		Super sup = new Sub();
		System.out.println(sup.getN());
		System.out.println(sup.n);
		System.out.println(((Sub) sup).n);
		System.out.println(((Sub) sup).getSuperN());

	}

}
