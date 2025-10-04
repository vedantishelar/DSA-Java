// Find the only non-repeating element using XOR

import java.util.*;
public class Solution15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int result = solve(arr);
        System.out.println(result);
    }
    
    public static int solve(int[] arr) {
        int unique = 0;
        for (int num : arr) {
            unique = unique ^ num; // XOR operation
        }
        return unique;
    }
}
