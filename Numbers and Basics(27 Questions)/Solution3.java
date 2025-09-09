// Check if a number is prime 

import java.util.*;
import java.io.*;

public class Solution3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution3 sol = new Solution3();
        int n = in.nextInt();
        boolean result = sol.solve(n);
        System.out.println(result);
    }

    public boolean solve(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}