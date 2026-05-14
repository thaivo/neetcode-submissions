class Solution {
    public boolean isAnagram(String s, String t) {
        if ( s.length() != t.length()) return false;
        Map<Character,Integer> mapAppearance = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            mapAppearance.merge(s.charAt(i), 1, Integer::sum);
            mapAppearance.merge(t.charAt(i), -1, Integer::sum);
        }
        
        for (Map.Entry<Character, Integer> entry : mapAppearance.entrySet()) {
            if( entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}
