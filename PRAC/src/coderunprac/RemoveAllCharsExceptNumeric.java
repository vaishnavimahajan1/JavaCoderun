//Remove all characters except the numeric characters from an alphanumeric string.

package coderunprac;

public class RemoveAllCharsExceptNumeric {

	public static void main(String[] args) {
		String S = "agdu789";
		String s1="1234567890";
		String str="";
		
		for(int i=0;i<S.length();i++)
		{
			if(s1.contains(S.charAt(i)+""))
			{
				str+=S.charAt(i)+"";
			}
		}
		System.out.println(str);

	}

}
