// Fibonacci sequence up to n terms

import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Solution2.fibonacci(n);
    }

    public static void fibonacci(int n) {
        if (n <= 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");

        if (n >= 1) {
            System.out.print("0");
        }

        if (n >= 2) {
            System.out.print(", 1");
            int a = 0, b = 1;
            for (int i = 2; i < n; i++) {
                int c = a + b;
                System.out.print(", " + c);
                a = b;
                b = c;
            }
        }
        System.out.println("]");
    }
}