class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int [] nge = new int[n];
        Stack<Integer> st= new Stack<Integer>(); 
        for(int i =2*n-1;i>=0;i--){
            while(!st.empty() && st.peek()<=arr[i%n]){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty() == false) nge[i] = st.peek();
                else nge[i] = -1;               
                
            }
            st.push(arr[i%n]);
            
        }
        return nge;
    }
}
