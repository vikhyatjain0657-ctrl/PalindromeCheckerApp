import java.util.Scanner;

/**MAIN CLASS UseCaselPalindromeApp

Use Case 10: Case-Insensitive & Space-Ignored Palindrome
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
        String input = in.next();
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

