class Solution {
    
    private void oc(int i,int []arr, int target,List<List<Integer>> ans,List<Integer> os){
        if(i==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(os));
            }
            return;
        }
        if(arr[i]<=target){
            os.add(arr[i]);
            oc(i,arr,target -arr[i],ans,os);
            os.remove(os.size()-1);
        }
        oc(i+1,arr,target,ans,os);
    }
    
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList();
        oc(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}

