import java.util.Scanner;

/**MAIN CLASS UseCaselPalindromeApp

Use Case 4: Character Array Based Validation

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
    public static void main(String[] args){{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String input = in.next();
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
    }
}
