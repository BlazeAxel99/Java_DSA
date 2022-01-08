
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
        String str = s.nextLine();
        substr(str);
	}
      public static void substr(String s){
		 for(int i=0;i<s.length();i++){
                  for(int j=i+1;j<=s.length();j++){
                      String str  = s.substring(i,j);
                      System.out.println(str);
                  }
              }
	  }
	
}

