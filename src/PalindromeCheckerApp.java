import java.util.Scanner;

/**MAIN CLASS UseCaselPalindromeApp

Use Case 13: Performance Comparison

 Description:

 This class validates a palindrome by converting the string into a character array and comparing characters using the two-pointer technique.
 At this stage, the application:
 Converts string to char array
 Uses start and end pointers
 Compares characters efficiently
 Displays the result
 This reduces extra memory usage.

@author Vikhyat
@version 1.0
*/

public class PalindromeCheckerApp {
    /**
     * Application entry point.
     * This is the first method executed by the JVIN
     * when the program starts.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String input = in.nextLine();
        long startTime = System.nanoTime();
        boolean isPalindrome = true;
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime);
    }
}