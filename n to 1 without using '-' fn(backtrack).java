class Main
{   
   	public static void rec(int i,int n){
           
          if(i>n){
			  return;
		  }
		  rec(i+1,n);
		  System.out.print(i+" ");

	   }

	public static void main (String[] args) throws java.lang.Exception      
	{
		// your code goes here
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		rec(1,n);
	}
}
