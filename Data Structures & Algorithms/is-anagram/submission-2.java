class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        if (t.length() != s.length()) {
            return false;
        }

        // is possible because if the length is not equal it is returned false!
        for (int i = 0; i < s.length(); i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
        }
        /***
        The equals() method of Map interface in Java is used to check if two maps are equal. Two maps are considered equal if they meet the following conditions.

        - Both maps must have the same size.
        - Both maps must contain identical key-value pairs. (It means every key in one map must be associated with the same value as in the other map)
        ***/
        return mapS.equals(mapT);
    }
}
