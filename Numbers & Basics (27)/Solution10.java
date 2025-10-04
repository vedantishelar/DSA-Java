// Automorphic number check

import java.util.*;
public class Solution10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean result = solve(n);
        System.out.println(result);
    }

    public static boolean solve(int n) {
        int square = n * n;
        int temp = n;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false;
            }
            temp = temp / 10;
            square = square / 10;
        }
        return true;
    }
}
