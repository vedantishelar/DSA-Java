// Sum of digits of a number

import java.util.*;
public class Solution6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int result = solve(n);
        System.out.println(result);
    }

    public static int solve(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;  
            sum = sum + digit;        
            n = n / 10;         
        }
        return sum;
    }
}