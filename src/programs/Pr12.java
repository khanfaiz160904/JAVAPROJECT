package programs;

class B {
	void show() {
		System.out.println("byeee");
	}
}

public class Pr12 extends B {
	void show() {
		System.out.println("hii");
	}

	public static void main(String[] args) {
		Pr12 b = (Pr12) new B();
		b.show();
	}

}