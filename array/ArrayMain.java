package array;

import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		final int max=20;
		int array[]= new int[max];
		int ch=0;
		
		Scanner sc= new Scanner(System.in);
		ArrayOperation obj = new ArrayOperation();
		
		System.out.println("Enter number of elements:");
		int n= sc.nextInt();
		do
		{
			System.out.println("1- Creation\n2- Display\n3- Other Opearations\n4- Interview Quetions");
			System.out.println("Enter Your Choice:");
			int choice= sc.nextInt();
			
			switch(choice)
			{
				case 1:
					 //array creation
					obj.create(array, n);
					break;
					
				case 2:
					//array display function
					System.out.println("Array :");
					obj.display(array, n);
					break;
					
				case 3:
					//perform different operations on array
					obj. other_operations(array, n);
					break;
					
				case 4:
					//Interview Questions on array
					obj. quetions(array, n);
					break;
				
			
			}
			
			
			System.out.println("\nDo u want to continue:if yes press 1::");
			 ch=sc.nextInt();
		}while(ch==1);
		
	}

}
