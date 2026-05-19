class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int numElements = row * col;
        if(numElements == 1)return (matrix[0][0] == target);
        int l = 0, r = numElements -1, mid=0;
        while(l < r){
            mid = l + (r-l)/2;
            if(matrix[mid/col][mid%col] < target) l = mid + 1;
            else if(matrix[mid/col][mid%col] > target) r = mid;
            else return true;
        }
        return matrix[l/col][l%col] == target;
    }
}
