///Print numbers from 1 to N without the help of loops.

package coderunprac;

public class printwithoutloop {
	 public static void printNumbers(int current, int N) {
	        if (current <= N) {
	            System.out.print(current + " ");
	            printNumbers(current + 1, N);
	        }
	    }

	    public static void main(String[] args) {
	        int N = 10; // Replace with the desired value of N
	        printNumbers(1, N);
	    }
}

/*class Solution
{

public void printNos(int N)
  {
      if(N>0){
          printNos(N-1);
          System.out.print(N+ " ");
      }
  }
}
*/