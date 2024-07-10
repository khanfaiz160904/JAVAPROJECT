package programs;

class Test implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

public class Pr7 {
	public static void main(String[] args) {
		Test t = new Test();
		Thread th = new Thread(t);
		th.start();

	}

}
