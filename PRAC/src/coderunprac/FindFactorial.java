//Calculate factorial of a given number N.
package coderunprac;

public class FindFactorial {

	public static void main(String[] args) {
	     int n = 5;
	        int factorial = 1; // Initialize factorial to 1

	        for (int i = 1; i <= n; i++) {
	            factorial *= i; // Multiply by each positive integer from 1 to n
	        }

	        System.out.println("Factorial of " + n + " is: " + factorial);
	    }
}


// return (n==0||n==1)?1:n*this.find_fact(n-1);