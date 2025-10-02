// Perfect number check  

import java.util.*;
public class Solution8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean result = solve(n);
        System.out.println(result);
    }

    public static boolean solve(int n) {
        int sum = 0;

        for(int i = 1; i < n; i++) {
            if(n % i == 0){
                sum = sum + i;
            }
        }

        if(n == sum) {
            return true;
        }
        return false;
    }
}