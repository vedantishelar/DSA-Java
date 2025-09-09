// Check for leap year

import java.util.*;

public class Solution5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution5 sol = new Solution5();
        int year = in.nextInt();
        boolean result = sol.solve(year);
        System.out.println(result);
    }

    public boolean solve(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}