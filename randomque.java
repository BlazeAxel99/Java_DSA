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
        String S = s.nextLine();
        String a ="";
        String [] b= new String[S.length()];
      
   
        int count =0;
        S = S.replaceAll("6","9");
        int sum =0;
      int j=0;
      int k=0;
      StringBuilder o= new StringBuilder();
      for(int i=0;i<S.length();i++){
           
          if( S.charAt(i) == ','){
              StringBuilder sb= new StringBuilder();
              sb.append(S.substring(j,i));
              j = i+1;
            
              b[k] = sb.toString();
             // System.out.println(b[k]);
              k++;
                
          }
         
          
      }
       o.append(S.substring(j,S.length() ));
          b[k] =  o.toString();
          // System.out.println(b[k]);
        
         for(int r =0;r<=k;r++){
                StringBuilder p= new StringBuilder();
                for(int y =0;y<b[r].length();y++){
                    if(b[r].charAt(y)== '9'){
                        p.append(b[r]);
                        p.reverse();
                        b[r] = p.toString();
                       //System.out.println(b[r]);
                       break;
                    }
                }
           } 

           for(int r =0;r<=k;r++){
                int number = Integer.parseInt(b[r]);
               sum += number;
           }
            System.out.println(sum/(k+1));
  
    //  for(int i=0;i<k;i++){
    //      for(int z=0;j<b[i].length();z++){
    //          if(b[i].charAt(z) == 6){
    //            StringBuilder sb= new StringBuilder();
    //            sb.append(b[i]);
    //            sb.reverse();
    //            b[i] = sb.toString();

    //          }
    //      }
    //      for (int z = 0;z<k;z++ ){
    //            int number = Integer.parseInt(b[z]);
    //            sum += number;
    //      }
    //      int ans = (sum)/k;
    //      System.out.print(ans);
    //  }
     
  
       
	}
}

