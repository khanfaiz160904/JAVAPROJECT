package programs;

public class Pr19 {
   //write a program to check whether a number is palindrome or not
	public static void main(String[] args) {

		int num = 121;
		int temp = num;
		int rev = 0;
		int rem;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (num == rev) {
			System.out.println(num + " is palindrome number");
		} else {
			System.out.println(num + " is not palindrome number");
		}
		
	}

}
