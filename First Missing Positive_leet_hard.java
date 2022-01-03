class Solution {
    public static int seg(int[] arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]<=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        return i;
    }
    
    public int firstMissingPositive(int[] nums) {
        int start = seg(nums);
        int [] arr1 = new int [nums.length - start];
        int k = 0;
        for(int i=start;i<nums.length;i++){
            arr1[k] = nums[i];
            k++;
        }
        for(int i=0;i<arr1.length;i++){
            int x = Math.abs(arr1[i]);
            if(x -1<arr1.length && arr1[x -1]>0){
                arr1[x-1] = -arr1[x-1]; 
            }
        }
        int ans =0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>0)
                return i+1;
        }
        return arr1.length +1;
    }
}
