class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] output = new int[size];
        int[] pref = new int[size];
        int[] suff = new int[size];

        pref[0] = 1;
        for( int i = 1; i < size; i++){
            pref[i] = nums[i-1]*pref[i-1];
        }
        suff[size-1] = 1;
        for(int i = size -2; i >= 0; i-- ){
            suff[i] = nums[i +1] * suff[i + 1];
        }


        for( int i = 0; i < size; i++){
            output[i] = pref[i] * suff[i];
        }
        
        return output;
    }
}  
