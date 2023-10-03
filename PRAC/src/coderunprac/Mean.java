//Given the marks of N students in an Array A, calculate the mean.

package coderunprac;

public class Mean {

	public static int calMean(int N,int[] A) {
		int sum=0;
		for(int i=0;i<N;i++)
		{
			sum+=A[i];
		}
		return sum/N;

	}
	public static void main(String args[])
	{
		int[] array= {22,4,5,6};
		int result=calMean(array.length,array);
		System.out.println(result);
	}

}
