import java.util.Scanner;

public class Solution1 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);  
        String input = sc.nextLine(); 
        Solution1 sol = new Solution1(); 
        String result = sol.solve(input); 
        System.out.println(result); 
    }
    
    public String solve(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        char[] chars = s.toCharArray();
        int left = 0; 
        int right = chars.length - 1;
        while (left < right) { 
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp; 
            left++; 
            right--;
        } 
        return new String(chars);
    } 
}