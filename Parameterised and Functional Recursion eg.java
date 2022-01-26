class Main
{
    public static int fnson(int n){//functional way
    if(n==0){
        return 0;
    }
    return n + fnson(n-1);
}
   public static void son(int i,int n){ //parametersied way
       if(i<1){
          System.out.print(n+" ");
          return;
       }
       son(i-1,n+i);
   }

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        son(10,0);
         System.out.print(fnson(10));
	}
}
