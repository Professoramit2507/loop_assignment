public class one_b {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println("Sum of all squares between 1 and 100: " + sum);
    }
}