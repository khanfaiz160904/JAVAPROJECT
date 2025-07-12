package CodSoft;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int m = scanner.nextInt();

		System.out.println("Prime numbers between 1 and " + m + " are:");
		for (int n = 2; n <= m; n++) {
			boolean isPrime = true; // Assume n is prime
			for (int i = 2; i <= n / 2; i++) { // Check divisors from 2 to n/2
				if (n % i == 0) { // If n is divisible by i, it's not prime
					isPrime = false;
					break; // Exit inner loop
				}
			}
			if (isPrime) { // If no divisor found, print the number
				System.out.print(n + " ");
			}
		}
	}
}
