package array;

import java.util.Scanner;

public class arrayCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner sc = new Scanner(System.in);
	int array[]= new int[20];
	 System.out.print("Enter Number of element:");
	 int n=sc.nextInt();
		
		for(int i=0; i<n;i++)
		{
		    System.out.println("Enter Element"+(i+1)+":");
		    array[i]= sc.nextInt();
		}
		
	    System.out.println("----------------------------------");
	    for(int i=0; i<n;i++)
		{
		    System.out.print(array[i]+"\t");
		     
		}
	}

}
