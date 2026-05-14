class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] alphabets = new int[26];
            for(char c:str.toCharArray()){
                alphabets[c - 'a']++;
            }
            String key = Arrays.toString(alphabets);
            if(!map.containsKey(key)){
                ArrayList<String> value = new ArrayList<>();
                value.add(str);
                map.put(key,value);
            } else {
                map.get(key).add(str);
            }
        }
        return new ArrayList<>(map.values());
    }
}
