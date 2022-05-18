package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args)
	{
	int[] arr = {1,2,3,4,7,6,8};
	int length = arr.length;
    Arrays.sort(arr);
	for(int i=1;i<length-1;i++)
	{
		
		if(i!=arr[i-1])
		{
			System.out.println(i);
		}
	}
	

	}
}
	

	


	
  
	


