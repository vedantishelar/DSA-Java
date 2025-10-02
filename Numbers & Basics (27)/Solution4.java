// Print all primes in range 
import java.util.*;

public class Solution4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        range(n, m);
    }

    public static void range(int n, int m) {
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");  // print in same line
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false; 
        if (num == 2) return true; 

        for (int i = 2; i <= num / 2; i++) {  
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
