package programs;

class T extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

public class Pr6 {
	public static void main(String[] args) {
		T t = new T();
		t.start();
	}

}
