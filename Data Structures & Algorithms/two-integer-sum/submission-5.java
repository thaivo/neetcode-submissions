class Solution {
    public int[] twoSum(int[] nums, int target) {
        if( nums.length == 2){
            if(nums[0] + nums[1] == target) return new int[] {0,1};
        }
        // duplicate of the original array
        
        int [][] sorted_nums = new int[nums.length][2];
        for(int i = 0 ; i < nums.length; i++){
            sorted_nums[i][0] = nums[i];
            sorted_nums[i][1] = i;
        }

        Arrays.sort(sorted_nums, Comparator.comparingInt(a -> a[0]));
        for(int i = 0, j = nums.length - 1;;){
            if(sorted_nums[i][0] + sorted_nums[j][0] > target){
                j--;
            }
            else if (sorted_nums[i][0] + sorted_nums[j][0] < target){
                i++;
            }    
            else return new int[]{Math.min(sorted_nums[i][1],sorted_nums[j][1]), Math.max(sorted_nums[i][1],sorted_nums[j][1])};
        }
    }
}
