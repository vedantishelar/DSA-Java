// Find factorial of a number

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution1 sol = new Solution1();
        int n = in.nextInt();
        long result = sol.solve(n);
        System.out.println(result);
    }

    public long solve(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * solve(n - 1);
        }
    }
}