class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] outputArr = new int[2];
        int l = 0, r = numbers.length -1;
        while(numbers[l] + numbers[r] != target){
            if(numbers[l] + numbers[r] > target){
                r--;
            } else if (numbers[l] + numbers[r] < target){
                l++;
            }
        }
        return new int[]{++l,++r};
    }
}
