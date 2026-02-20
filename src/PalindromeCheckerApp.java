import java.util.Scanner;
import java.util.Stack;

/**
 * MAIN CLASS UseCaselPalindromeApp
 * <p>
 * Use Case 5: Stack Based Palindrome Checker
 * <p>
 * Description:
 * <p>
 * This class validotes a palindrome using Stock datu structure ahich follows the LIFO principle.
 * At This stage, the application:
 * Pushes characters into tack
 * Pops then in reverse order
 * Compares with original sequence
 * Displays the result
 * This maps stack Dehavior to reversal Legio
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
            System.out.print("Enter Text: ");
            String input = in.next();
            Stack<Character> stack = new Stack<>();

            for (char c : input.toCharArray()) {
                stack.push(c);
            }

            boolean isPalindrome = true;

            for (char c : input.toCharArray()) {
                if (c != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("Is Palindrome?: " + isPalindrome);
            in.close();
        }
    }
}
