package programs;

import java.util.Scanner;

public class Hack {
	public static void main(String[] args) {
		String s, s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String : ");
		s = sc.nextLine();
		System.out.println("Enter the second String : ");
		s1 = sc.nextLine();
		if (s.compareTo(s1) > 0) {
			System.out.println("First String is greater than Second String");
		} else if (s.compareTo(s1) < 0) {
			System.out.println("First String is less than Second String");
		} else {
			System.out.println("First String is equal to Second String");
		}
		sc.close();

	}
}
