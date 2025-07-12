package CodSoft;

import java.util.Scanner;

public class Khan {
	public static void main(String[] args) {
		int temp, m, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of m: ");
		m = sc.nextInt();
		System.out.println("Enter Value of n: ");
		n = sc.nextInt();
		temp = m;
		m = n;
		n = temp;
		System.out.println("Swapped numbers are: ");
		System.out.println("m :" + m + " and " + "n :" + n);
		sc.close();
	}
}
