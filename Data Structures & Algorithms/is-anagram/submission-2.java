class Solution {
    public boolean isAnagram(String s, String t) {
        if ( s.length() != t.length()) return false;
        Map<Character,Integer> mapS = new HashMap<>(), mapT = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
           mapS.merge(s.charAt(i), 1, Integer::sum);
           mapT.merge(t.charAt(i), 1, Integer::sum);
        }
        if( mapS.size() != mapT.size())return false;
        for (Map.Entry<Character, Integer> entry : mapS.entrySet()) {
            if( mapT.containsKey(entry.getKey()) == false || !mapT.get(entry.getKey()).equals(entry.getValue())){
                return false;
            }
        }
        return true;
    }
}
