package array;

public class Leval_1_Que {
	 /*-----------------------------------------------------------------
 		1)	finding min-max in array
-------------------------------------------------------*/


	public void minMax(int[] a, int n)
	{
		int min=a[0];
		int max=a[0];
		
		for(int i=0;i<n;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			else if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		 
		
		System.out.println("Minimum element: "+min);
		System.out.println("Maximum element: "+max);
	}

	 /*-----------------------------------------------------------------
				2)	Reverse the given array
	        -------------------------------------------------------*/
	public void reverse(int[] a, int n)
	{

		System.out.println("Reverse Array:");
		for(int i=n-1; i>=0;i--)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println("\n");
	}
	
	 /*-----------------------------------------------------------------
	 		3)	Count number of occurrence in sorted array;
-------------------------------------------------------*/
	public void noOccurrance(int[] a, int n, int no) 
	{
		
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(no==a[i])
				count++;
			
		}
		System.out.println("\nNumber of Occurrance:"+ count);
		
	}
}
