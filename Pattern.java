class Pattern
{
   public static void main (String[] args)
   {		
       int i, j,k,l; 
       
       for (i = 1; i <= 5; i++)         
       { 		  	  
          for(j =1; j<=i; j++)
		  {
             System.out.print(j);
		  }
			 System.out.println();	
       }	
	   
	   for (k=5;k>=1;k--)
	   {
		  for(l=1;l<=k;l++)
		 {
		     System.out.print(l);
		 }	
		     System.out.println();
	   }
	       
   }
}