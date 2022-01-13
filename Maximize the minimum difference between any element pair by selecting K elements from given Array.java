import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 int []arr = { 1, 4, 9, 0, 2, 13, 3 };
		System.out.print(findMinMax(arr,4));
	}
	public static int findMinMax(int []arr,int k ){
		int ans =1;
		Arrays.sort(arr);
		int end = arr[arr.length -1];
		int start =0;
		while(start<=end){
		int 	mid = (start + end)/2;
			if(isMax(arr,mid,k)){
				ans = mid;
				start = mid +1;
			}else{
				end = mid -1;
			}
		}return ans;
	}
	public static boolean isMax(int []arr,int diff ,int k){
		int count =1;
		int ele = arr[0];
		for(int i=1;i<arr.length;i++){
			if(ele +diff<=arr[i]){
				count++;
				if(count ==k){
					return true;
				}ele = arr[i];
			}
		}return false;
	}
}
