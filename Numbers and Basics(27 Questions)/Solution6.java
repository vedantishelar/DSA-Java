// Sum of digits of a number

import java.util.*;

public class Solution6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution6 sol = new Solution6();
        int n = in.nextInt();
        int result = sol.solve(n);
        System.out.println(result);
    }

    public int solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}