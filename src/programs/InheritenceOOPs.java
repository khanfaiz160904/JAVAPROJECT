package programs;

class B {
	void show() {
		System.out.println("byeee");
	}
}

public class InheritenceOOPs extends B {
	void show() {
		System.out.println("hii");
	}

	public static void main(String[] args) {
		InheritenceOOPs b = (InheritenceOOPs) new B();
		b.show();
	}

}