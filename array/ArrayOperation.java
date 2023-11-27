package array;

import java.util.Scanner;

public class ArrayOperation {
	
	int ch=0;
	 Scanner sc =new Scanner(System.in);
	public int[] create(int[] array, int n) {
		// TODO Auto-generated method stub
		for(int i=0; i<n;i++)
		{
		    System.out.println("Enter Element "+(i+1)+": ");
		    array[i]= sc.nextInt();
		}
		return array;
	}

	public void display(int[] array, int n) {
		// TODO Auto-generated method stub
		for(int i=0; i<n;i++)
		{
		    System.out.print(array[i]+"\t");
		     
		}
		
	}
	
	public void other_operations(int[] array, int n)
	{
		 Array_Sorting s1= new Array_Sorting();
		 ArraySearching s2= new ArraySearching();
		do
		{
			System.out.println("operations on array:-\n");
			 System.out.println("1- Sorting\n2- Searching\n3- Deletion\n4- Insertion");
			 int choice=sc.nextInt();
			 switch(choice)
			 {
				 case 1:
					 //sorting
					 s1.sorting(array, n);
					 break;
					 
				 case 2:
					 //searching element
					 System.out.println("Enter key to search:");
					 int key=sc.nextInt();
					  s2.search(array, n, key);
					 break;
					   
			 }
			 System.out.println("\nDo u want to  perform operations:if yes press 1::");
			 ch=sc.nextInt();
		}while(ch==1);
	}

	public void quetions(int[] array, int n) {
		// TODO Auto-generated method stub
		IntQuestion q1= new IntQuestion();
		q1.que(array, n);
		
	}
	
	
	
	
 
}
