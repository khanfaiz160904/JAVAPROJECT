package codSoft;

class B {
	void show(int a) {
		System.out.println("1");
	}
}

public class September extends B {
	void show(int a) {
		System.out.println("2");
	}

	public static void main(String[] args) {
		B b = new September();
		b.show(10);
	}
}
