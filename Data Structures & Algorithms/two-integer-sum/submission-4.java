class Solution {
    public int[] twoSum(int[] nums, int target) {
        if( nums.length == 2){
            if(nums[0] + nums[1] == target) return new int[] {0,1};
        }
        // duplicate of the original array
        int[] sorted_nums = nums.clone();
        
        Arrays.sort(sorted_nums);
        int i = 0, j = nums.length - 1;
        for(;;){    
            if(sorted_nums[i] + sorted_nums[j] > target){
                j--;
            }
            else if (sorted_nums[i] + sorted_nums[j] < target){
                i++;
            }    
            else break;
        }
        
        ArrayList<Integer> output = new ArrayList<>();
        for(int k = 0; k < nums.length; k++){
            if(nums[k] == sorted_nums[i]){
                output.add(k);
            }
            else if(nums[k] == sorted_nums[j]){
                output.add(k);
            }
            if(output.size() == 2) break;
        }
        
        return output.stream()
                           .mapToInt(Integer::intValue)
                           .toArray();
    }
}
