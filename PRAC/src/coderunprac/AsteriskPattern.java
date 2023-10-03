//Given a number N. The task is to print a series of asterisk(*) from 1 till N terms with increasing order and difference being 1.
package coderunprac;

public class AsteriskPattern {
	public static void main(String args[])
	{
		int n=3;
		for(int i=1;i<=n;i++)
		{
			String str="*";
			System.out.print(str.repeat(i)+ " ");
		}
	}

}
