package programs;

public class StringToInteger {
	public static void main(String[] args) {

		String str = "2";

        int a = Integer.parseInt(str);

        System.out.println("Converted integer value: " + a);
        
        String s= String.valueOf(a);
        System.out.println(s);
        
	}

}
