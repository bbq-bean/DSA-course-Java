import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        // anagram is both words are use same letters and amount of letters
        // This solution is O(n) time and O(n) space
        
        // corner cases
        if (s.length() != t.length()) {
            return false;
        
        } else if (s.length() == 0) {
            return false;
            
        }
        
        // lets build 2 dicts and compare, we can do it in 1 pass
        HashMap<Character, Integer> s_map = new HashMap<>();
        HashMap<Character, Integer> t_map = new HashMap<>();
        
        for (int i=0; i<s.length(); i++) {
            /* 
            THE BIG PART:
            -------------
            1- for each letter, create an entry in the map where the letter is the key
            2- the value is the previous value if the entry already existed + 1, or 0 + 1
            */
            s_map.put(s.charAt(i), s_map.getOrDefault(s.charAt(i), 0) + 1);
            t_map.put(t.charAt(i), t_map.getOrDefault(t.charAt(i), 0) + 1);
        }
        
        if (s_map.equals(t_map)) {
            return true;
        }
        
        return false;
        
    }
}