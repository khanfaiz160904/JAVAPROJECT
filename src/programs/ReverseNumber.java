package programs;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 87501;
        int reversed = 0;
        while(number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }
}