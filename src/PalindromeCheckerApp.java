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
        // UC1
        System.out.println("System initialized successfully");
        Scanner sc = new Scanner(System.in);

        // UC2
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
