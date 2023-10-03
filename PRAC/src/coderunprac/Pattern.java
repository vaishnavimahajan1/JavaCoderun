/*You are given a number N. You need to print the pattern for the given value of N.
Input: 2
Output:
2 2 1 1 $2 1 $
*/

package coderunprac;

class GFG {
	    public static void main(String[] args) {
	        int n = 5;
	        System.out.println("The value of n is: " + n);
	        for (int i = n; i > 0; i--) {
	            for (int j = n; j > 0; j--) {
	                for (int k = 0; k < i; k++) {
	                    System.out.print(j + " ");
	                }
	            }
	            System.out.print("$");
	        }
	    }
	}
