import java.util.LinkedList;
import java.util.Scanner;
/**MAIN CLASS UseCaselPalindromeApp

Use Case 13: Performance Comparison

 Description:

 This class valldates a pahndrome uszng recursion.
 Characters are compared from the outer positions
 mcnng inward using recurnve calls.
 The recurszon stops when
 - All characters are matched,
 - A nsratch is found.
 This use case demonstrates divide-and-conquer
 logic using method recursxon.

@author Vikhyat
@version 1.0
*/

public class PalindromeCheckerApp {

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
        }
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime);
    }
}
