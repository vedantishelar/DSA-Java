// LCM (Least Common Multiple)

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int result = solve(a, b);
        System.out.println(result);
    }

    public static int solve(int a, int b) {
        int originalA = a;
        int originalB = b;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a; 

        int lcm = (originalA * originalB) / gcd; 
        
        return lcm;
    }

}
