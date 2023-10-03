//Given 3 numbers A, B and C. Find the greatest number among them.

package coderunprac;

public class PrintGreatest {

	public static void main(String[] args) {
		int A=10;
		int B=3;
		int C=2;
		
		int greatest= (A>B&&A>C)?A:((B>A&&B>C)?B:C);
		System.out.println("Greatest number is :" +greatest);
	}

}
