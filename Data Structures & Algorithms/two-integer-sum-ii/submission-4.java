class Solution {
    public int[] twoSum(int[] numbers, int target) {
        SortedMap<Integer,Integer> map = new TreeMap<>();
        for(int i = 0 ; i < numbers.length; i++){
            map.put(numbers[i],i+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            if(map.containsKey(target - entry.getKey())){
                return new int[]{Math.min(entry.getValue(), map.get(target - entry.getKey())), Math.max(entry.getValue(), map.get(target - entry.getKey()))};
            }
        }
        return new int[]{0,0};
    }
}
