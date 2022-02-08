//display vowles first consonant second with index first occ of first vowels ans last occ of consonant in given string


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{     


   public static String srt(String s){

       char tempArray[] = s.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
        return new String(tempArray);


   }



	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        String io = s.nextLine();
        String v ="";
        String c = "";
        int vc = 0;
        int cc =0;
        int a1 =0;
        int a2 = 0;
        for(int i=0;i< io.length();i++){
          if(io.charAt(i) == 'a' ||io.charAt(i)== 'e' ||io.charAt(i)== 'i' ||io.charAt(i)== 'o' ||io.charAt(i)== 'u' ){
              v += io.charAt(i);
              vc++;
              
          }
          else{
              c += io.charAt(i);
              cc++;
          }

          
  }
   

      
       

           v = srt(v);
           c = srt(c);

          for(int i=0;i<io.length();i++){
              if(vc>0 && io.charAt(i) == v.charAt(0)){
                  a1 = i;
                  break;
              }
             
          }
           for(int i=0;i<io.length();i++){
              if(cc>0 && io.charAt(i) == c.charAt(cc - 1)){
                  a2 = i;
                  
              }
             
          }

        if(vc>0){
         System.out.print(v);
          System.out.print(a1);
        }
        else{
            System.out.print("NA");
          System.out.print("-1");
        }
        if(cc>0){
          System.out.print(c);
          System.out.print(a2);

        }
        else{
            System.out.print("NA");
          System.out.print("-1");

        }
	}
}
