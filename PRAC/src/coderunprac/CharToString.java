//Given a list of characters, merge all of them into a string.

package coderunprac;

import java.util.Arrays;
import java.util.List;

public class CharToString {

    public static String charToStr(List<Character> charList) {
        StringBuilder str = new StringBuilder();
        for (char c : charList) {
            str.append(c);
        }

        return str.toString();
    }

    public static void main(String[] args) {
        List<Character> charList = Arrays.asList('H', 'e', 'l', 'l', 'o');
        String result = charToStr(charList);
        System.out.println("Merged String: " + result);
    }
}



