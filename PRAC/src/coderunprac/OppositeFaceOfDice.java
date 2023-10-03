//You are given a cubic dice with 6 faces. All the individual faces have a number printed on them. The numbers are in the range of 1 to 6, like any ordinary dice. You will be provided with a face of this cube, your task is to guess the number on the opposite face of the cube.
package coderunprac;

public class OppositeFaceOfDice {

	 static int oppositeFaceOfDiceDemo(int N) {
		
		return 7-N; //sum of the numbers on opposite faces is always equal to 7. 

	}
	 public static void main(String args[])
	 {
		 int opposite = OppositeFaceOfDice.oppositeFaceOfDiceDemo(3);
		 System.out.println("The opposite face is: " + opposite); // This will print "The opposite face is: 4"
	 }

}
