package codSoft;

import java.util.Scanner;

public class New9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("value of i : ");
		int i = scanner.nextInt();

		System.out.println("value of o : ");
		int o = scanner.nextInt();

		if (i == 30) {
			System.out.println("if executed");
		} else if (o > 100) {
			System.out.println("1st else if executed");
		} else if (i <= o) {
			System.out.println("2nd else if executed");
		} else {
			System.out.println("else executed");
		}
	}
}