//Given a string, check if all its characters are the same or not.
package coderunprac;

public class AllSameCharacters {

	public static void main(String[] args) {
		String s="hh";
		
		boolean a=true;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(0)==s.charAt(i))
			{
				continue;
			}else
				a=false;
		}
		System.out.println(a);
	}

}
