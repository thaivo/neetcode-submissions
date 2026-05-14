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
        System.out.printf("sorted_nums[%d]:%d, sorted_nums[%d]:%d ",i, sorted_nums[i],j, sorted_nums[j]);
        for(int k = 0; k < nums.length; k++){
            System.out.printf("nums[%d]: ", nums[k]);
            if(nums[k] == sorted_nums[i]){
                output.add(k);
                System.out.println("first if: "+ output);
            }
            else if(nums[k] == sorted_nums[j]){
                output.add(k);
                System.out.println("second if: "+ output);
            }
            System.out.println("output.size: "+ output.size());
            if(output.size() == 2) break;
        }
        
        return output.stream()
                           .mapToInt(Integer::intValue)
                           .toArray();
    }
}
