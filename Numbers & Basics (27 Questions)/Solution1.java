// Find factorial of a number

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var sol = new Solution1();

        int n = sc.nextInt();
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