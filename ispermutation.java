 import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{   
    

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        String str = s.next();
		String str2 = s.next();
       boolean x =  isperm(str,str2);
		if(x == true){
			System.out.println("true");
		} 
		else{
			System.out.println("false");
		}

	}

  
   public static boolean isperm(String str,String str2){
        int [] count = new int[26];
        for(int i=0;i<str.length();i++){
           char x = str.charAt(i);
           int index = x -'a';
           count[index]+=1;
        }
		for(int i=0;i<str2.length();i++){
           char x = str2.charAt(i);
           int index = x -'a';
           count[index]-=1;
        }
		for(int i=0;i<count.length;i++){
            if(count[i]!=0){
            return false;   
            
            }
        }
		return true;

   }
}
