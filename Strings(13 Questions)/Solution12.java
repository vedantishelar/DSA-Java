import java.util.*;

public class Solution12{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input=in.nextInt();

         for(int i=1; i<=input; i++) {
             for(int j=1; j<=i; j++) {  
                 System.out.print("*"); 
             } 
             System.out.println();
         }
  
        for(int i=input; i>=1; i--) {
            for(int j=1; j<=i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}