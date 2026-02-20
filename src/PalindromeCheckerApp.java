import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/**
 * MAIN CLASS UseCaselPalindromeApp
 * <p>
 * Use Case 6: UseCase6Palindrome CheckerApp
 * <p>
 * Description:
 * <p>
 * This class demonstrates palindrome validation using wo different data structures:
 * Queue (FIFO First In First Out)
 * Stack (LIFO -Last In First Out)
 * Characters are inserted into both structures and t then Compared by removing from the front of the queue and the top of the stack.
 * If all characters match, the input string is confirmed as a palindrome.
 * This use case helps understand how FIFO and LIFO Dehaviors can be combined for symmetric comparison.
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
            Queue<Character> queue = new LinkedList<>();
            Stack<Character> stack = new Stack<>();

            for (char c : input.toCharArray()) {
                queue.add(c);
                stack.push(c);
            }

            boolean isPalindrome = true;

            while (!queue.isEmpty()) {
                if (!queue.poll().equals(stack.pop())) {
                    isPalindrome = false;
                    break;
                }
            }
            System.out.print("Is Palindrome?:");
            System.out.println(isPalindrome);
        }
    }
}
