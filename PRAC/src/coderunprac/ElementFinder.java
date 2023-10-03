package coderunprac;

public class ElementFinder {


    public static void isElementPresent(int arr[], int N, int X) {
        int index = -1; // Initialize the index to -1 (not found)

        for (int i = 0; i < N; i++) {
            if (arr[i] == X) {
                index = i; // Update the index if the element is found
                break;     // Exit the loop since the element is found
            }
        }

        System.out.println("Index of " + X + " in the array is: " + index);
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        int targetElement = 5;

        isElementPresent(array, array.length, targetElement);
    }

}
