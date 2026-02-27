import java.util.LinkedList;
import java.util.Scanner;
/**MAIN CLASS UseCaselPalindromeApp

Use Case 8: Linked L ISt Based Patindrone Checker

 Description:

 This class cnecks whether a strzng is a pat Indrome
 Sing a L InkedL2st.
 haracters are added to the ust and then compared
 y removing elements fron both ends:
 - removeFirst()
 - removeLast()
 Thzs demonstrates how LankedLzst supports
 ouble-ended operations for symmetric validation.

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
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Text: ");
            String input = in.next();
            LinkedList<Character> list = new LinkedList<>();
            for (char c : input.toCharArray()) {
                list.add(c);
            }

            boolean isPalindrome = true;

            while (list.size() > 1) {
                char first = list.removeFirst();
                char last = list.removeLast();

                if (first != last) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + isPalindrome);
            System.out.println("Is Palindrome?: " + isPalindrome);
    }
}
