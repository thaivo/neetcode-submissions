class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        for(int l = 0, r = heights.length -1; l < r;)
        {
            max = Math.max(max,(r - l)*Math.min(heights[r], heights[l]));
            if(heights[r] > heights[l]) l++;
            else r--;
        }
        return max;
    }
}
