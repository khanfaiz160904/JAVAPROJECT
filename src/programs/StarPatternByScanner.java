package programs;

import java.util.Scanner;

public class StarPatternByScanner {
	public static void main(String args[]) {
		int n, c, d;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows of floyd's triangle you want");
		n = in.nextInt();
		System.out.println("Floyd's triangle :-");
		for (c = 1; c <= n; c++) {
			for (d = 1; d <= c; d++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
