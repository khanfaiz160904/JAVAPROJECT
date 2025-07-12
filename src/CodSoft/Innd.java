package CodSoft;

import java.util.Scanner;

public class Innd {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = scanner.nextInt();
		System.out.println("Enter Second Number : ");
		int b = scanner.nextInt();

		for (int i = 0; i < 10; i++) {
			a += b;
		}
		System.out.println(a);
	}
}
