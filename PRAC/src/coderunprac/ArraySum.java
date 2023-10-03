//Given an integer array Arr[] of size N. The task is to find sum of it.

package coderunprac;

public class ArraySum {

	public static int sumOfArray(int arr[],int n) {
		int sum=0;
		 // Iterate through the array and add each element to the sum
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	
	public static void main(String args[])
	{
		int[] array= {1,2,3,4,5};
		
		int sum=sumOfArray(array, array.length);
		System.out.println(sum);
		
	}

}
