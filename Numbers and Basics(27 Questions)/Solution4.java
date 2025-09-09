// Print all primes in range 

import java.util.*;

public class Solution4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution4 sol = new Solution4();

        int n = in.nextInt();
        int m = in.nextInt();

        String result = sol.solve(n, m);
        System.out.print(result);
    }

    public String solve(int n, int m) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;

        for (int num = n; num <= m; num++) {
            if (isPrime(num)) {
                if (!first) {
                    sb.append(" ");
                }
                sb.append(num);
                first = false;
            }
        }

        return sb.toString();
    }

    public boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}