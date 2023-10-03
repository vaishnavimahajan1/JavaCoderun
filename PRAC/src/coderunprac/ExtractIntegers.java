//Given a string s, extract all the integers from s.
/* create a function called extractIntegerWords that takes a sentence (a string) as input and returns a list of numbers (as strings).
 * Inside the function, we initialize an empty list called al to store the numbers we find and a special tool called a StringBuilder called currentNumber to help us build each number
 * If a character is a number (0-9), we add it to our currentNumber. This allows us to build a complete number by collecting its digits one by one.
 * If a character is a number (0-9), we add it to our currentNumber. This allows us to build a complete number by collecting its digits one by one.
 * After we've gone through the entire sentence, we check if there's still a number in currentNumber. If so, we add it to the list.
 * Finally, we return the list of numbers.
 * In the main part of the code, we test the extractIntegerWords function by providing it with a sample sentence, and then we print out the extracted numbers.
 */

package coderunprac;

import java.util.ArrayList;

public class ExtractIntegers {

	  public static ArrayList<String> extractIntegerWords(String s) 
	  {
	        ArrayList<String> al = new ArrayList<>();
	        StringBuilder currentNumber = new StringBuilder();

	        for (char c : s.toCharArray()) 
	        {
	            if (Character.isDigit(c)) 
	            {
	                currentNumber.append(c);
	            } else if (currentNumber.length() > 0) 
	            {
	                al.add(currentNumber.toString());
	                currentNumber.setLength(0);
	            }
	        }

	        if (currentNumber.length() > 0) {
	            al.add(currentNumber.toString());
	        }

	        return al;
	    }

	    public static void main(String[] args) {
	        String input = "I have 2 apples and 3 bananas, and the total is 5.";
	        ArrayList<String> result = extractIntegerWords(input);

	        // Print the extracted integer words
	        for (String word : result) {
	            System.out.println(word);
	        }
	    }																																																							

}
