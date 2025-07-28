package codSoft;

public class April {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i == 5 || i == 7 || i == 9) {
				continue;
			}
			System.out.println(i);
		}
	}
}