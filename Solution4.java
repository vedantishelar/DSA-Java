import java.util.Scanner;

public class Solution4 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Solution4 sol = new Solution4();
       String input = sc.nextLine();
       int result = sol.solve(input);
       System.out.println(result);
   }
   
   public int solve(String s) {
       int count = 0;
       for (int i = 0; i < s.length(); i++) {
           char ch = s.charAt(i);
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
               count++;
           }
       }
       return count;
   }
}