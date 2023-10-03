/*Given a number N. The task is to print Floyd's triangle with N lines.
   1
 * 23
 * 456
 * 78910
 */

package coderunprac;

public class FloydsTtriangle {
	public static void main(String srgs[])
	{
		int count=1; //Initialize a counter to keep track of the numbers to be printed
		int n = 4;
		for(int i=1;i<=n;i++) //prints rows
		{
			for(int j=1;j<=i;j++) //controls the number of rows in the triangle
			{
				System.out.print(count++ + " ");// controls the number of columns in each row
			}
			System.out.println(); // Move to the next line after each row is printed
		}
	}

}
