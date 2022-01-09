class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int i=0;
        int j=0;
        long [] ans = new long [n+m];
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
            System.out.print(ans[z]+" ");
        }
        
    }
}
