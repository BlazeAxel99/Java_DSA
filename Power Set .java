class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        int n = s.length();
        List <String> ans= new ArrayList<String>(); 
        
        for(int i=0;i<(1<<n);i++){
            String subs = new String();
            subs = "";
            for(int j=0;j<n;j++){
                if((i & (1<<j) )>0){
                    subs += s.charAt(j);
                }
                
            }
            if(subs.length() > 0){
		           ans.add(subs);
            }
		    }
		    Collections.sort(ans);
		    return ans;
        } 
        
    }
   
