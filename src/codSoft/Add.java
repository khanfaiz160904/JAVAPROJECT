package codSoft;
// write a program to show multiply of two numbers without using *

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String result = (num % 2 == 0) ? "even" : "odd";
		System.out.println(result);
	}

}