package programs;

public class Pr36 {
	public static void main(String[] args) {
		String str = "faiz";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
	}
}
