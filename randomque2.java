
// Custom Input
 
//  raines
// bowls
// 2

// Output
// raboinwless

// I/O
// raines
// bowls
// 7
// O/P
// rainesbowls

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
         String i1 = s.nextLine();
         String i2 = s.nextLine();
         String ans = "";
         int n = s.nextInt();
         
         if(n>i1.length() || n>i2.length()){
             System.out.print(i1);
              System.out.print(i2);
         }
         else{
         int i=0;
        
         while(i<i1.length()&& i<i2.length() && i+n <=i1.length()&& i+n<=i2.length() ){
          ans += i1.substring(i,i+n);
          ans += i2.substring(i,i+n);
          i += n;

         }
           ans += i1.substring(i,i1.length());
            ans += i2.substring(i,i2.length());
          }
         System.out.print(ans);
		 }
}
