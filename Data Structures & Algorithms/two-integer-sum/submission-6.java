class Solution {
    public int[] twoSum(int[] nums, int target) {
        if( nums.length == 2){
            if(nums[0] + nums[1] == target) return new int[] {0,1};
        }
        // duplicate of the original array
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        for(;i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                break;
            } else {
                map.put(nums[i],i);
            }
        }
        return new int[]{map.get(target - nums[i]), i};
    }
}
