//Given a English alphabet c, Write a program to check whether a character is a vowel or not.

package coderunprac;

import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a character: ");
	        char c = scanner.next().charAt(0);

	        if (isVowel(c)) {
	            System.out.println(c + " is a vowel.");
	        } else {
	            System.out.println(c + " is not a vowel.");
	        }

	        scanner.close();
	    }

	    public static boolean isVowel(char c) {
	        c = Character.toLowerCase(c); // Convert to lowercase to handle both upper and lower case vowels

	        switch (c) {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                return true;
	            default:
	                return false;
	        }
	}
}