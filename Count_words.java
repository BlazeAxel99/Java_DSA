class Solution 
{ 
    int countWords(String s) 
    { 
        // code here    
        if(s.length()==0){
			return 0;
		}
		int count =0;
		boolean a = true;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' ' ){
				a = true;
			}else if(a==true){
				a = false;
				count++;
			}
		}
		return count;
    }
} 
