// Find factorial of a number

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int result = solve(n);
        System.out.println(result);
    }

    public static int solve(int n) {
        if (n == 0) {
            return 1;
        
        } else {
            for (int i = n - 1; i >= 1; i--) {
                n = n * i;
            }
        }
        return n;
    }
}