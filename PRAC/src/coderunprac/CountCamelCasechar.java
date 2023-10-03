//Given a string. Count the number of Camel Case characters in it.
package coderunprac;

public class CountCamelCasechar {

	public static void main(String[] args) {
		String s="abUjJ";
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				count++;
			
			}
		}
		System.out.println(count);

	}

}
