class Main

  
{   
    
    public static void fn(int i,int []arr,int n){
        if(i>=n/2){
            return;
        }
       
         int temp;
         temp = arr[i];
         arr[i] = arr[n-i-1];
         arr[n-i-1] =temp;

        fn(i+1,arr,n);

      

    }

   	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        fn(0,arr,n);
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
        }
         
	}
}
