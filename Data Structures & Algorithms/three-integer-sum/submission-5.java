class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);
        HashSet<String> hs = new HashSet<>();
        for(int i = 0; i < nums.length -2;i++){
            for(int j = i+1, k = nums.length-1; j < k;){
                if(nums[i] + nums[j] + nums[k] > 0){
                    k--;
                } else if(nums[i] + nums[j] + nums[k] < 0){
                    j++;
                } else {
                    List<Integer> tempList = Arrays.asList(nums[i], nums[j], nums[k]);
                    String tripletStr = tempList.toString();
                    if(!hs.contains(tripletStr)){
                        hs.add(tripletStr);
                        triplets.add(tempList);
                    }
                    k--;
                }
            }
        }
        return triplets;
    }
}
