package programs;

public class PrintingMyName {
	// PRINT F,A,I,Z in order;

	public static void main(String[] args) {
		for (char c = 'F'; c <= 'Z'; c++) {
			if (c == 'F') {
				System.out.print(c);

			}
		}
		for (char i = 'A'; i <= 'Z'; i++) {
			if (i == 'A'|| i == 'I' || i == 'Z') {
				System.out.print(i);
			}
		}
	}
}
