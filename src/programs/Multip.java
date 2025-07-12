package programs;

import java.util.Scanner;

public class Multip {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		System.out.println("Multiplication table of " + num + " is: ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		scanner.close();
	}
}