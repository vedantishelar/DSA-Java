// Pattern printing -- Inverted-Angled Triangle of Stars

import java.util.Scanner;

public class Solution13b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = n; i >= 1; i--) {   
            for (int j = 1; j <= i; j++) {   
                System.out.print("* ");
            }
            System.out.println();   
        }
    }
}
