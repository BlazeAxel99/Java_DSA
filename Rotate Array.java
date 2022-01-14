class Solution {
    public void rotate(int[] a, int k) {
        int n = a.length;
        k=k%n;
        int j =0;
        int [] arr1 = new int[n];
    for(int i = 0; i < n; i++)
    {
        if(i<k)
        {
            // Printing rightmost
            // kth elements
            arr1[j] = a[n + i -k];
            j++;
        }
        else
        {
            // Prints array after
            // 'k' elements
            arr1[j] = a[i - k];
            j++;
        }
    }
        for(int i=0;i<n;i++){
            a[i] = arr1[i];
        }
    //System.out.println();
        
    }
}
