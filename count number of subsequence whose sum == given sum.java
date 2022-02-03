import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{     
  public static int subarraySum( int i, int sum ,int[] nums, int k) {
       
        if(i==nums.length){
            if(sum==k){
                return 1;
            }
            else return 0;
        }
        sum +=nums[i];
      int l =  subarraySum(i+1,sum,nums,k);
        sum -= nums[i];
        int r = subarraySum(i+1,sum,nums,k);
        
        return l + r;
    }


	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        int k = s.nextInt();
        System.out.print(subarraySum(0,0,a,k));
	}
}
