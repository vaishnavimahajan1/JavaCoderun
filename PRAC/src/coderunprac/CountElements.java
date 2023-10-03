//Given an sorted array A of size N. Find number of elements which are less than or equal to given element X.
package coderunprac;

public class CountElements {

	public static long countOfElement(long arr[],long n,long x) {
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]<=x)
			{
				count++;
			}
		}
		return count;

	}
	public static void main(String args[])
	{
		long[] array= {1,3,5,6,7,8,10};
		long targetEle=7;
		
		long count=countOfElement(array,array.length,targetEle);
		System.out.println("Number of elements less than or equal to "+targetEle+":" +count	);
		
		
	}

}
