package programs;

public class Pr20 {
	public static void main(String[] args) {
		int row = 4;
		int row1 = 5;
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for (int i = row1; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				System.out.print("* ");

			}
			System.out.println(" ");

		}
	}
}
