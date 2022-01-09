class Solution {
    public void merge(int[] arr1, int n, int[] arr2, int m) {
   int i=0;
        int j=0;
        int [] ans = new int [n+m];
        int k=0;
        while(i<n&& j<m){
            if(arr1[i]>arr2[j]){
               ans[k] = arr2[j];
               k++;
               j++;
            }else {
                ans[k] = arr1[i];
               k++;
               i++;
            }
        }
            while(i<n){
             ans[k] = arr1[i];
               k++;
               i++;
            } while(j<m){
              ans[k] = arr2[j];
               k++;
               j++;
            }
        
        for(int z=0; z<ans.length;z++){
             arr1[z] = ans[z];
        }
    }
}
