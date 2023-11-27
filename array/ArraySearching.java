package array;

public class ArraySearching {
	 
	public void search(int[] array, int n, int key) {
		// TODO Auto-generated method stub
		int flag=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]==key)
				flag=1;
		}
		if(flag==1)
		{
			System.out.println("Key Found.");
		}
		else
		{
			System.out.println("Key not found");
		}
	 
		
	}

	 

}
