package array;

import java.util.Scanner;
public class IntQuestion {
	public void que(int[] array, int n) {
		// TODO Auto-generated method stub
		
		Leval_1_Que l1=new Leval_1_Que();
		Array_Sorting s1= new Array_Sorting();
		int ch;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("1) Finding min and max\n2) Array Reverse\n3)Number of Occurance\n4) no Number of Occurance");
			System.out.println("Enter Choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					l1.minMax(array, n);
					break;
					
				case 2:
					 l1.reverse(array, n);
					break;
					
				case 3:
					System.out.println("Enter number for count:");
					int no=sc.nextInt();
					s1.sorting(array, n);
					l1.noOccurrance(array, n, no);
					break;
					
				case 4:
					System.out.println("Enter number for count:");
					int n1o=sc.nextInt();
					l1.noOccurrance(array, n, n1o);
					break;
			}
			System.out.println("Check more Questions:press 1:");
			ch=sc.nextInt();
		}while(ch==1);
		
	}

}
