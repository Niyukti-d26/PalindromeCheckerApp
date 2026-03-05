import java.util.Scanner;

public class PalindromeCheckerApp {
    public static boolean checkPalindrome(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // UC2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input text: ");
        String text = sc.nextLine();

        boolean isPalindrome = checkPalindrome(text);

        if (isPalindrome) {
            System.out.println("UC2: Text is a palindrome.");
        } else {
            System.out.println("UC2: Text is not a palindrome.");
        }

    }
}
