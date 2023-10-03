//Given a string str containing only lowercase letters, generate a string with the same letters, but in uppercase.

package coderunprac;

public class ConevertToUppercase {

	public static String converToUpperCase(String str) {
		return str.toUpperCase();
	}
	public static void main(String[] args) {
		String defaultstr="pikachu";
		String toUpperCase=converToUpperCase(defaultstr);
		System.out.println(toUpperCase);
	}


}
