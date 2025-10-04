// Strong number check

import java.util.*;
public class Solution9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean result = solve(n);
        System.out.println(result);
    }

     public static boolean solve(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;  
            sum = sum + factorial(digit);        
            n = n / 10;         
        }

        if (sum == original) {
            return true;  
        } else {
            return false; 
        }
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        
        } else {
            for (int i = num - 1; i >= 1; i--) {
                num = num * i;
            }
        }
        return num;
    }
}