package programs;

import java.util.Scanner;

public class SingleTable1ForLoop {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER NUMBER : ");
		int num = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}
}
