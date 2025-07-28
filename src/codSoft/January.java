package codSoft;

public class January {
	January() {
		this(20);
		System.out.println("no-args");
	}

	January(int a) {
		this("abc", 20);
		System.out.println("1-arg");
	}

	January(String a, int b) {
		System.out.println("2-args");
	}

	public static void main(String[] args) {
		January january = new January();
	}
}
