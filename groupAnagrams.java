class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // code for the interface not the implementation
        // our hashmap will be a key of the sorted version of all anagrams
        // the value will be a list of all the seent combos
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // create array of characters
            char[] chars = word.toCharArray();
            Arrays.sort(chars); // you are stupid if you dont know what this means

            // convert char array to real String
            String sortedWord = new String(chars);

            // if current sorted word not in hashmap, initialize the entry
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            // CORE LOGIC - IF THE SORTED WORD IS THE SAME AS THE KEY, ITS AN ANAGRAM!
            // SO ADD THE UNSORTED VERSION OF THE WORD. NEATO.
            map.get(sortedWord).add(word);
        }

        // map.values returns a list of values per entry
        return new ArrayList<>(map.values());
    }
}
