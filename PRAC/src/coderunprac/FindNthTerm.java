//Given a number N, find the Nth term in the series 1, 3, 6, 10, 15, 21…

package coderunprac;

public class FindNthTerm {

	public static int findNthT(int N) {
		
		int sum= (N*(N+1));
		return sum;

	}
	 public static void main(String[] args) {
	        int N = 5; // You can change N to any positive integer you want to find the sum for
	        int result = findNthT(N);
	        System.out.println("The sum of the first " + N + " natural numbers is: " + result);
	    }

}
