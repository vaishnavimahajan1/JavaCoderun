//Given an array Arr of size N, print all its elements.
package coderunprac;

public class PrintArrayElements {

	public static void printArray(int arr[]) {
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
	public static void main(String args[])
	{
		int[] array= {1,34,5,5,6};
		printArray(array);
	}

}
