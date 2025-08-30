public class LCMofTwoNumbers {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static long lcm(int a, int b) {
        return (long) a * b / gcd(a, b); 
    }

    public static void main(String[] args) {
        int N = 4;
        int M = 6;

        System.out.println("LCM of " + N + " and " + M + " is: " + lcm(N, M));
    }
}
