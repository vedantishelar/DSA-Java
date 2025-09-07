// Find the first non-repeating character in a string

import java.util.*;
     
public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution6 sol = new Solution6();
        
        String str = sc.nextLine();
        char result = sol.solve(str);
        
        System.out.println(result);
    }
    
    public char solve(String str) {
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCount.put(c, charCount.containsKey(c) ? charCount.get(c) + 1 : 1);
        }
        
        for (char c : charCount.keySet()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }
        
        return '\0';
    }
}