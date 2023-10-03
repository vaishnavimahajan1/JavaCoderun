//Given an integer N, find the sum of odd numbers and even numbers from 1 to N.

package coderunprac;

public class SumOfOddEvenNumbers {

	public static int[] findSum(int N) {
		int[] sums= {0,0};
		for(int i=1;i<=N;i++)
		{
			if(i%2==0)
			{
				sums[1]+=i;// Add even number to the even sum
			}
			else {
				sums[0]+=i;// Add odd number to the odd sum
			}
		}
		return sums;

	}

    public static void main(String[] args) {
        int N = 10;
        int[] sums = findSum(N);

        System.out.println("Sum of odd numbers from 1 to " + N + ": " + sums[0]);
        System.out.println("Sum of even numbers from 1 to " + N + ": " + sums[1]);
    }	

}
