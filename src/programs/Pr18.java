package programs;

public class Pr18 {
	public static void main(String[] args) {
		int number = 12321;
		int temp = number;
		int reverse = 0;
		while (temp != 0) {
			int lastDigit = temp % 10;
			reverse = reverse * 10 + lastDigit;
			temp /= 10;
		}
		if (number == reverse) {
			System.out.println(number + " is a palindrome number.");
		} else {
			System.out.println(number + " is not a palindrome number.");
		}
	}

}
