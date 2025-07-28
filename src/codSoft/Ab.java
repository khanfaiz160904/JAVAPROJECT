package codSoft;

public class Ab {
	static int a;

	public int show() {
		System.out.println(a);
		a = 20;
		System.out.println(a);
		return 0;

	}

	public static void m1() {
		System.out.println(a);
	} 

	public static void main(String[] args) {
		Ab ab = new Ab();
		ab.show();
		Ab.m1();
	}
}
