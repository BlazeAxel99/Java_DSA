import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{

   public static void ps(int id,ArrayList<Integer> L,int [] a,int n){
    //    int n = a.length();
        if(id==n){
               System.out.println(L);

             return;
        }
          //ps(id+1,L,a,n);
         L.add(a[id]);
         ps(id+1,L,a,n);
         L.remove(L.size() - 1);
         ps(id+1,L,a,n);
        

   }


	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner s = new Scanner(System.in);
		int n =3;
        int [] arr = new int[3];
		for(int i=0;i<3;i++){
	        arr[i] = s.nextInt();
		}
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        ps(0,a,arr,n);
	}
}
