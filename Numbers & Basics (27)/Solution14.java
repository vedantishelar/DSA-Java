// Count number of 1s in binary (Hamming weight)

import java.util.*;
public class Solution14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int result = solve(n);
        System.out.println(result);
    }

    public static int solve(int n) {
        int count = 0;

        while (n > 0) {
            count = count + (n & 1); // Increment count if the last bit is 1
            n = n >> 1;       // Right shift n to process the next bit
        }

        return count;
    }
}