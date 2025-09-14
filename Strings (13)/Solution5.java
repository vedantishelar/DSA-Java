// Count frequency of characters in a string using hashmap

import java.util.*;

public class Solution5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        LinkedHashMap<Character,Integer>map = new LinkedHashMap<>();

        for( int i = 0; i < str.length(); i++ ) {

            char ch = str.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for( char ch : map.keySet() ) {
            System.out.println(map.get(ch));
        }

        in.close();
        
    }
}

// other solution

/*

// Count frequency of characters in a string using hashmap

import java.util.*;

public class Solution5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        HashMap<Character,Integer>map = new HashMap<>();

        for( int i = 0; i < str.length(); i++ ) {

            char ch = str.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for( char ch : map.keySet() ) {
            System.out.println(ch+" "+map.get(ch));
        }

        in.close();
        
    }
}


 */
