package array;

public class Array_Sorting {
	public int[] sorting(int array[], int n)
	{
		int temp=0;
		for(int i=0;i<n;i++)
	     {
	    	 for(int j=1;j<(n-i);j++)
	    	 {
	    		 if(array[j-1]>array[j])
	    		 {
	    			 temp=array[j-1];
	    			 array[j-1]=array[j];
	    			 array[j]=temp;
	    		 
	    		 }
	    	 }
	     }
	    
	    for(int i=0; i<n;i++)
		{
		    System.out.print(array[i]+"\t");
		     
		}
		return array;
	    
	}

}
