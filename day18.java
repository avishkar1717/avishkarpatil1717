import java.util.Scanner;
public class DivisorCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();  
        int count = 0;

        for (long i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                if (i * i == N) {
                    count++;  
                } else {
                    count += 2;  
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
