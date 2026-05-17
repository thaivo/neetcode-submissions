class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        for(int firstPointer = 0; firstPointer < heights.length -1; firstPointer++)
        {
            for(int secondPointer = firstPointer + 1; secondPointer < heights.length; secondPointer++)
            {
                int area = Math.min(heights[firstPointer], heights[secondPointer]) * (secondPointer - firstPointer); 
                max =  Math.max(area, max);
            }
        }
        return max;
    }
}
