package CodSoft;

public class Emp {
	public static void main(String[] args) {
		String string = "hello world java";

		String[] strings = string.split("\\s+");
		int count = strings.length;
		System.out.println(count);
	}
}