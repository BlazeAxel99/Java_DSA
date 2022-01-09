class Solution {
    String equilibrium(int arr[], int n) {
        // code here
        String Y ="YES";
        String N = "NO";
        int ls = 0;
        int rs =0;
        for(int i=0;i<n;i++){
            rs+= arr[i];
        }
        for(int i=0;i<n;i++){
            rs-= arr[i];
            if(rs==ls){
                return Y;
            }
            ls += arr[i];
        }
        return N;
    }
