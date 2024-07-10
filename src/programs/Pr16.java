package programs;

class Pr16 {
    public static int sum(int... x) {
        int total = 0;
        for (int num : x) {
            total += num;
        }
        return total;
    }

    public static void main(String args[]) {
        System.out.println(sum(10));
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
    }
}
