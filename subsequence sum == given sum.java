import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main



 {   @SuppressWarnings("unchecked")
     public static void ps(int inx,ArrayList<Integer> L,int s,int[]arr,int sum,int n ){
               if(inx ==n){
                 if(s==sum){  
                   for(int i=0;i<L.size();i++){
                    System.out.print(L.get(i)+" ");
                   }
                     System.out.println();
                 }
                   return;
               }
         L.add(arr[inx]);
          s += arr[inx]; 

         ps(inx+1,L,s,arr,sum,n);

    
         s = s - arr[inx];
         L.remove(L.size() - 1);
         ps(inx+1,L,s,arr,sum,n);

      }




    @SuppressWarnings("unchecked")
	 public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++ ){
            arr[i] = s.nextInt();
        }
        int sum = s.nextInt();
        ArrayList<Integer>L = new ArrayList<Integer>();
        ps(0,L,0,arr,sum,n);
	}
}

