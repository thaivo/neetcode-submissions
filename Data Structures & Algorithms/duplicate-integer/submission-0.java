class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length > 1 ){
            Map<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++){
                if( map.put(nums[i],nums[i]) != null ){
                    return true;
                }
            }
        }
        return false;
    }
}