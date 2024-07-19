package programs;

public class StringSplit {

	public static void main(String[] args) {
		String str="My Name Is Faiz";
		String[] str1=str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);
		}
		
	}

}
