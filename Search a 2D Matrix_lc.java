class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix[0].length -1;
       // if(nums.length==1 && nums[0]==target){
       //     return 0;
       // }
        while(start<matrix.length && end>=0){
            // int mid = (start+end)/2;
            if(matrix[start][end]== target){
                return true;
            }
            else if(matrix[start][end]<target){
                start++;
            }
            else{
               end--;
            }
        }
        return false;
    }
}
