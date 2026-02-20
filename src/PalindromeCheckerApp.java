import java.util.Scanner;

/**
 * MAIN CLASS UseCaselPalindromeApp
 *
 * Use Case 2: Application Entry & Welcome Message
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value
 * At this stage, the application:
 * Iterates the string in reverse order
 * - Builds a reversed version
 * Compares original and reversed strings
 * Displays the validation result
 * This introduces transformation-based validation.
 *
 * @author Vikhyat
 * @version 1.0
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
        {
            Scanner in = new Scanner(System.in);
            String input,reversed="";
            int i;
            boolean isPalindrome = true;
            System.out.print("Enter String: ");
            input = in.next();
            for (i = input.length()-1;i>=0;i--) {
                reversed=reversed+input.charAt(i);
                }
            System.out.print("Is it a Palindrome? : ");
            if (input.equals(reversed))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
