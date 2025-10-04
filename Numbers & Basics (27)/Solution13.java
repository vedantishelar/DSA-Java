// Check if a number is power of 2 (bitwise)

import java.util.*;
public class Solution13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean result = solve(n);
        System.out.println(result);    
    }

    public static boolean solve(int n) {
        if (n <= 0) {
            return false; 
        }
        return (n & (n - 1)) == 0; 
    }
}
