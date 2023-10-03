//Given two positive integers A and B, find GCD of A and B.
package coderunprac;

public class GCD {

	public static void main(String[] args) {
		int A=3;
		int B=6;
		
		while(A!=0&&B!=0)
		{
			if(A>B)
			{
				A %=B; //subtract B from A (reduce size of A from large size to smaller)
			}
			else {
				B %=A;
			}
		}
		System.out.println(A!=0?A:B);

	}

}
